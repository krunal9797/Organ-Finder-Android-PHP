package com.example.orgendonation.Receipient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.orgendonation.API.ApiHandler;
import com.example.orgendonation.MainActivity;
import com.example.orgendonation.Model.RecipientRequestModel;
import com.example.orgendonation.R;
import com.example.orgendonation.Receipient.DashBoardRecipient;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;


public class RequestDonor extends AppCompatActivity {
    EditText r_name, r_cnum, r_orgen, r_bloodgroup, r_disease, r_description;
    Button btn_submitrequest;
    String name=null,contact=null,orgen=null,bloodgroup=null,disease=null,description=null;
    Context ctx = this;
    Spinner spn_blood,spn_state,spn_orgens;
    String[] blood = { "A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-"};
    ArrayAdapter adapter;
    ArrayAdapter orgenAdapter;
    String[] orgens;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_donor);
        allocatememory();
        setEvents();
    }

    private void setEvents()
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

        orgens = getResources().getStringArray(R.array.array_orgens);
        orgenAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,orgens);
        orgenAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn_orgens.setAdapter(orgenAdapter);
        spn_orgens.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                orgen = String.valueOf(orgens[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });



        btn_submitrequest.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                boolean validSuccess = true;
                name = r_name.getText().toString();
                contact = r_cnum.getText().toString();
                disease = r_disease.getText().toString();
                description = r_description.getText().toString();

                if (name.equals(""))
                {
                    r_name.setError("name can not be empty");
                }
                else if (contact.equals(""))
                {
                    r_name.setError("name can not be empty");
                }
                else if (orgen.equals(""))
                {
                    spn_orgens.requestFocusFromTouch();
                }

                else if (bloodgroup.equals(""))
                {
                    spn_blood.requestFocusFromTouch();
                }
                else if (disease.equals(""))
                {
                    r_disease.setError("Disease no can not be empty");
                }
                else if (description.equals(""))
                {
                    r_description.setError("description no can not be empty");
                }
                else if (validSuccess == true)
                {
                    ApiHandler.getApiService().request(r_name.getText().toString(),r_cnum.getText().toString()
                            ,orgen,bloodgroup,r_disease.getText().toString(),
                            r_description.getText().toString(), new Callback<RecipientRequestModel>()
                            {
                                @Override
                                public void success(RecipientRequestModel recipientRequestModel, Response response)
                                {
                                    String value = new String(((TypedByteArray) response.getBody()).getBytes());
                                    if (value.contains("Failed"))
                                    {
                                        Toast.makeText(ctx, "Request Failed", Toast.LENGTH_LONG).show();
                                    }
                                    else
                                    {
                                        Toast.makeText(ctx, "Request Successful", Toast.LENGTH_SHORT).show();
//                                        Intent dash = new Intent(getApplicationContext(),DashBoardRecipient.class);
//                                      startActivity(dash);
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
    }


    private void allocatememory()
    {
        r_name = findViewById(R.id.r_name);
        r_cnum = findViewById(R.id.r_cnum);
        spn_blood = findViewById(R.id.spn_blood);
        spn_orgens = findViewById(R.id.spn_orgens);
        r_disease = findViewById(R.id.r_disease);
        r_description = findViewById(R.id.r_description);
        btn_submitrequest = findViewById(R.id.btn_submitrequest);
    }
}