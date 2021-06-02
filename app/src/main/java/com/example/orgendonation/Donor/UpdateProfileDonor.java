package com.example.orgendonation.Donor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orgendonation.API.ApiHandler;
import com.example.orgendonation.Model.DonorLoginModel;
import com.example.orgendonation.Model.UpdateProfileDonorMOdel;
import com.example.orgendonation.R;
import com.google.android.material.textfield.TextInputEditText;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

import java.io.IOException;
import java.net.HttpURLConnection;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class UpdateProfileDonor extends AppCompatActivity {
    TextInputEditText d_name;
    TextInputEditText d_email;
    TextInputEditText d_cnum;
    TextInputEditText d_dob;
    TextInputEditText d_bloodgroup;
    TextInputEditText d_disease;
    TextInputEditText d_category;
    Spinner spn_selectcategory;
    TextView tv_category;
    Button btn_update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile_donor);
        AllocateMemory();
    }

    private void AllocateMemory() {
        d_name = findViewById(R.id.d_name);
        d_email = findViewById(R.id.d_email);
        d_cnum = findViewById(R.id.d_cnum);
        d_dob = findViewById(R.id.d_dob);
        d_bloodgroup = findViewById(R.id.d_bloodgroup);
        d_disease = findViewById(R.id.d_disease);
        d_category = findViewById(R.id.d_category);
        spn_selectcategory = findViewById(R.id.spn_selectcategory);
        tv_category = findViewById(R.id.tv_category);
        btn_update = findViewById(R.id.btn_update);

        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String name=d_name.getText().toString().trim();
                String email=d_email.getText().toString().trim();
                String category=d_category.getText().toString().trim();
                String disease=d_disease.getText().toString().trim();


                if(name.isEmpty()){
                    d_name.setError("Please enter user name");
                    d_name.requestFocus();
                    return;
                }
                else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    d_email.requestFocus();
                    d_email.setError("Please enter correct email");
                    return;
                }
                else if(category.isEmpty())
            {
                    d_category.setError("Please enter user name");
                    d_category.requestFocus();
                    return;
                }
                else if(disease.isEmpty())
                {
                    d_disease.setError("Please enter user name");
                    d_disease.requestFocus();
                    return;
                }
                ApiHandler.getApiService().updonor(d_name, d_email, d_category, d_disease, new Callback<DonorLoginModel>() {
                    @Override
                    public void success(DonorLoginModel donorLoginModel, Response response) {
                        Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Toast.makeText(getApplicationContext(),"Fail",Toast.LENGTH_SHORT).show();
                    }
                });



            }
        });
    }

}






