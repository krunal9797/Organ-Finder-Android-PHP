package com.example.orgendonation.Donor;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orgendonation.API.ApiHandler;
import com.example.orgendonation.Donor.LoginDonor;
import com.example.orgendonation.MainActivity;
import com.example.orgendonation.Model.DonorRegModel;
import com.example.orgendonation.R;
import com.example.orgendonation.Receipient.RegisterRecipient;
import com.google.android.material.textfield.TextInputEditText;

import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.GregorianCalendar;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;

import static com.example.orgendonation.API.ApiHandler.getApiService;


public class RegisterDonor extends AppCompatActivity
{
    TextInputEditText d_name, d_email, d_pass, d_dob, d_disease,d_city,d_contact;
    Spinner spn_blood,spn_state,spn_orgens;
    TextView tv_category,tv_donorlogin,tv_blood,tv_state,tv_orgens;
    Button btn_RegDonor;
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
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_donor);
        AllocateMemory();
        Setevent();
    }


    private void Setevent()
    {

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

        d_dob.setFocusable(false);
        d_dob.setOnClickListener(new View.OnClickListener()
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
                        d_dob.setText(Day + "/" + (Month+1) + "/" + Year);
                    }
                }, year, month, day);
                dp.show();
            }
        });

        sharedPreferences = getApplicationContext().getSharedPreferences("Pref", 0);
        final SharedPreferences.Editor editor = sharedPreferences.edit();


        btn_RegDonor.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                boolean validSuccess = true;
                name = d_name.getText().toString();
                email = d_email.getText().toString();
                password = d_pass.getText().toString();
                date = d_dob.getText().toString();
                disease = d_disease.getText().toString();
                city = d_city.getText().toString();
                contact = d_contact.getText().toString();


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
                    d_name.setError("Please Enter Your FullName");
                    d_name.requestFocusFromTouch();
                }
                else if (email.equals(""))
                {
                    d_email.setError("Please Enter Your Email");
                    d_email.requestFocusFromTouch();
                }
                else if (password.equals(""))
                {
                    d_pass.setError("Please Enter Your Password");
                    d_pass.requestFocusFromTouch();
                }
                else if (date.equals(""))
                {
                    d_dob.setError("Please Enter Your DOB");
                    d_dob.requestFocusFromTouch();
                }
                else if (contact.equals(""))
                {
                    d_contact.setError("");
                    d_contact.requestFocusFromTouch();
                }
                else if (bloodgroup.equals(""))
                {
                    spn_blood.requestFocusFromTouch();
                }
                else if (disease.equals(""))
                {
                    d_disease.setError("Please Enter Your Disease");
                    d_disease.requestFocusFromTouch();
                }
                else if (state.equals(""))
                {
                    spn_state.requestFocusFromTouch();
                }
                else if (city.equals(""))
                {
                    d_city.requestFocusFromTouch();
                }
                else if (category.equals(""))
                {
                    spn_orgens.requestFocusFromTouch();
                }
                else if (validSuccess == true)
                {
                    ApiHandler.getApiService().dreg(d_name.getText().toString(), d_email.getText().toString(),
                            d_pass.getText().toString(),
                            d_dob.getText().toString(), gender, bloodgroup,
                            d_disease.getText().toString(), state, category,d_city.getText().toString(),d_contact.getText().toString(),
                            new Callback<DonorRegModel>()

                            {
                        @Override
                        public void success(DonorRegModel donorRegModel, Response response) {

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
                                editor.putString("sharedName", name);
                                editor.putString("sharedEmail", email);
                                editor.putString("sharedPass", password);
                                editor.apply();

                                Intent i = new Intent(ctx, LoginDonor.class);
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
                }

            }
        });

        tv_donorlogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(),LoginDonor.class);
                startActivity(i);
            }
        });


    }



    private void AllocateMemory()
    {
        d_name = findViewById(R.id.d_name);
        d_email = findViewById(R.id.d_email);
        d_pass = findViewById(R.id.d_pass);
        d_dob = findViewById(R.id.d_dob);
        d_city = findViewById(R.id.d_city);
        d_contact = findViewById(R.id.d_contact);

        d_disease = findViewById(R.id.d_disease);
        tv_category = findViewById(R.id.tv_category);
        tv_donorlogin = findViewById(R.id.tv_donorlogin);
        btn_RegDonor = findViewById(R.id.btn_RegDonor);
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
