package com.example.orgendonation.Receipient;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orgendonation.API.ApiHandler;
import com.example.orgendonation.Donor.LoginDonor;
import com.example.orgendonation.MainActivity;
import com.example.orgendonation.Model.DonorRegModel;
import com.example.orgendonation.Model.ReceipientsRegModel;
import com.example.orgendonation.Model.ReceiptsLoginModel;
import com.example.orgendonation.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;
import java.util.GregorianCalendar;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.http.Query;
import retrofit.mime.TypedByteArray;


public class RegisterRecipient extends AppCompatActivity
{
    TextInputEditText r_name, r_email, r_pass, r_dob, r_disease,r_city,r_contact;
    Spinner spn_blood,spn_state,spn_orgens;
    TextView tv_category,tv_rLogin,tv_blood,tv_state,tv_orgens;
    Button btn_RecDonor;
    RadioGroup rg_gender;
    RadioButton rb_male,rb_female,rb_other,selectedRadioButton;
    Context ctx = this;
    SharedPreferences sharedPreferences;
    String name = null, email = null, password = null, date = null,bloodgroup="", gender = "", disease = null, state = "", category = "",
            city = null,contact=null;
    ArrayAdapter adapter;
    ArrayAdapter stateadapter;
    ArrayAdapter orgenAdapter;

    String[] blood = { "A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-"};
    String[] states;
    String[] orgens;
    private ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_recipient);
        AllocateMemory();
        Setevent();
    }

    private void Setevent()
    {
        pd = new ProgressDialog(this);
        pd.setMessage("Please wait...");
        pd.setCancelable(true);
        pd.setCanceledOnTouchOutside(false);
        adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,blood);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn_blood.setAdapter(adapter);
        spn_blood.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                bloodgroup = String.valueOf(blood[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        states =  getResources().getStringArray(R.array.array_state);
        stateadapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,states);
        stateadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn_state.setAdapter(stateadapter);
        spn_state.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                state = String.valueOf(states[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        orgens = getResources().getStringArray(R.array.array_orgens);
        orgenAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,orgens);
        orgenAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn_orgens.setAdapter(orgenAdapter);
        spn_orgens.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                category = String.valueOf(orgens[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

        r_dob.setFocusable(false);
        r_dob.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                GregorianCalendar gc1 = new GregorianCalendar();
                int year,month,day;
                year = gc1.get(Calendar.YEAR);
                month = gc1.get(Calendar.MONTH);
                day = gc1.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dp = new DatePickerDialog(ctx, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int Year, int Month, int Day)
                    {
                        r_dob.setText(Day + "/" + (Month+1) + "/" + Year);
                    }
                }, year, month, day);
                dp.show();
            }
        });

        sharedPreferences = getApplicationContext().getSharedPreferences("Pref", 0);
        final SharedPreferences.Editor editor = sharedPreferences.edit();


        btn_RecDonor.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                boolean validSuccess = true;
                name = r_name.getText().toString();
                email = r_email.getText().toString();
                password = r_pass.getText().toString();
                date = r_dob.getText().toString();
                disease = r_disease.getText().toString();
                city = r_city.getText().toString();
                contact = r_contact.getText().toString();


                if(rb_male.isChecked())
                {
                    gender="Male";
                }
                if(rb_female.isChecked())
                {
                    gender="Femle";
                }
                if(rb_other.isChecked())
                {
                    gender="Femle";
                }
                if (name.equals(""))
                {
                    r_name.setError("Please Enter Your FullName");
                    r_name.requestFocusFromTouch();
                }
                else if (email.equals(""))
                {
                    r_email.setError("Please Enter Your Email");
                    r_email.requestFocusFromTouch();
                }
                else if (password.equals(""))
                {
                    r_pass.setError("Please Enter Your Password");
                    r_pass.requestFocusFromTouch();
                }
                else if (date.equals(""))
                {
                    r_dob.setError("Please Enter Your DOB");
                    r_dob.requestFocusFromTouch();
                }
                else if (contact.equals(""))
                {
                    r_contact.setError("");
                    r_contact.requestFocusFromTouch();
                }
                else if (bloodgroup.equals(""))
                {
                    spn_blood.requestFocusFromTouch();
                }
                else if (disease.equals(""))
                {
                    r_disease.setError("Please Enter Your Disease");
                    r_disease.requestFocusFromTouch();
                }
                else if (state.equals(""))
                {
                    spn_state.requestFocusFromTouch();
                }
                else if (city.equals(""))
                {
                    r_city.requestFocusFromTouch();
                }
                else if (category.equals(""))
                {
                    spn_orgens.requestFocusFromTouch();
                }
                else if (validSuccess == true)
                {
                    ApiHandler.getApiService().reg(r_name.getText().toString(), r_email.getText().toString(),
                            r_pass.getText().toString(),
                            r_dob.getText().toString(), gender, bloodgroup,
                            r_disease.getText().toString(), state, category,r_city.getText().toString(),r_contact.getText().toString(),
                            new Callback<ReceipientsRegModel>()
                            {
                                @Override
                                public void success(ReceipientsRegModel receipientsRegModel, Response response) {

                                    String value = new String(((TypedByteArray) response.getBody()).getBytes());

                                    if (value.contains("user already exist"))
                                    {
                                        Toast.makeText(ctx, "User Already Exist", Toast.LENGTH_LONG).show();
                                    }
                                    else if (value.contains("failed"))
                                    {
                                        Toast.makeText(ctx, "Signup Failed", Toast.LENGTH_LONG).show();
                                    } else {
                                        Toast.makeText(ctx, "Signup Successful", Toast.LENGTH_SHORT).show();

                                        editor.clear();
                                        editor.putString("sharedRName", name);
                                        editor.putString("sharedREmail", email);
                                        editor.putString("sharedRPass", password);
                                        editor.apply();

                                        Intent i = new Intent(ctx, LoginRecipient.class);
                                        startActivity(i);
                                    }

                                }


                                @Override
                                public void failure(RetrofitError error)
                                {
                                    String er = error.toString();
                                    Log.d("<>", er);
                                    Toast.makeText(ctx, "Signup failed:" + er, Toast.LENGTH_SHORT).show();

                                }
                            });

                    pd.dismiss();
                }

            }
        });


        tv_rLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(),LoginRecipient.class);
                startActivity(i);
            }
        });

    }

    private void AllocateMemory()
    {
        r_name = findViewById(R.id.r_name);
        r_email = findViewById(R.id.r_email);
        r_pass = findViewById(R.id.r_pass);
        r_dob = findViewById(R.id.r_dob);
        r_city = findViewById(R.id.r_city);
        r_contact = findViewById(R.id.r_contact);

        r_disease = findViewById(R.id.r_disease);
        tv_category = findViewById(R.id.tv_category);
        tv_rLogin = findViewById(R.id.tv_rLogin);
        btn_RecDonor = findViewById(R.id.btn_RecDonor);
        tv_blood = findViewById(R.id.tv_blood);
        tv_state = findViewById(R.id.tv_state);
        //spinner
        spn_blood = findViewById(R.id.spn_blood);
        spn_state = findViewById(R.id.spn_state);
        spn_orgens = findViewById(R.id.spn_orgens);

        //radio
        rg_gender = findViewById(R.id.rg_gender);
        rb_male = findViewById(R.id.rb_male);
        rb_female = findViewById(R.id.rb_female);
        rb_other = findViewById(R.id.rb_other);
    }

}


