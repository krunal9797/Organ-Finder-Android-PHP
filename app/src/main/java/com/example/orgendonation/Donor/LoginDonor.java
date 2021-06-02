package com.example.orgendonation.Donor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orgendonation.API.ApiHandler;
import com.example.orgendonation.Model.DonorLoginModel;
import com.example.orgendonation.R;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;


public class LoginDonor extends AppCompatActivity {
    TextView d_email,d_pass;
    TextView tv_forgotpassword;
    Button btn_donorlogin,btn_donersign;
    String email= null,pass = null,name=null;
    SharedPreferences sharedPreferences;
    Context ctx = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_donor);
        AllocateMemory();
        setEvent();
    }

    private void setEvent()
    {

        final SharedPreferences.Editor editor = sharedPreferences.edit();


        btn_donorlogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                email = d_email.getText().toString();
                pass = d_pass.getText().toString();
                boolean loginsuccess = true;

                ConnectivityManager conMgr = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netInfo = conMgr.getActiveNetworkInfo();

                if (netInfo == null || !netInfo.isConnected() || !netInfo.isAvailable())
                {
                    Toast.makeText(getApplicationContext(), "No Internet connection!", Toast.LENGTH_LONG).show();
                    loginsuccess = false;
                }
                else if (email.equals(""))
                {
                    d_email.setError("Enter Email");
                    loginsuccess = false;
                }
                else if (pass.equals(""))
                {
                    d_pass.setError("Enter Password");
                    loginsuccess = false;
                }
                else if (loginsuccess==true)
                {
                    ApiHandler.getApiService().dr(d_email.getText().toString(), d_pass.getText().toString(), new Callback<DonorLoginModel>()
                    {
                        @Override
                        public void success(DonorLoginModel loginModel, Response response)
                        {
                            String value = new String(((TypedByteArray) response.getBody()).getBytes());

                            if (value.contains("success"))
                            {
                                editor.clear();
                                editor.putString("sharedName",name);
                                editor.putString("sharedEmail", email);
                                editor.putString("sharedPass", pass);
                                editor.apply();
                                Intent i = new Intent(LoginDonor.this, DashboardDonor.class);
                                i.putExtra("Email",email);
                                i.putExtra(name,name);
                                startActivity(i);
                                Toast.makeText(ctx, "Successful", Toast.LENGTH_SHORT).show();
                            }
                            else if (value.contains("incorrect"))
                            {
                                d_pass.setError("Incorrect Password");
                                Toast.makeText(ctx, "Password Incorrect", Toast.LENGTH_LONG).show();
                            }
                            else if (value.contains("not found"))
                            {
                                d_email.setError("User Not Found");
                                Toast.makeText(ctx, "User Not Found", Toast.LENGTH_LONG).show();
                            }
                        }

                        @Override
                        public void failure(RetrofitError error)
                        {
                            String er = error.toString();
                            Toast.makeText(ctx, "Failed" + er, Toast.LENGTH_LONG).show();
                            Log.d("<>", "in fail");
                        }
                    });
                }
            }
        });

        btn_donersign.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent donerreg = new Intent(getApplicationContext(),RegisterDonor.class);
                startActivity(donerreg);
            }
        });
    }

    private void AllocateMemory()
    {
        sharedPreferences = getApplicationContext().getSharedPreferences("Pref", 0);
        d_email = findViewById(R.id.d_email);
        d_pass =findViewById(R.id.d_pwd);
        tv_forgotpassword = findViewById(R.id.tv_forgotpassword);
        btn_donorlogin = findViewById(R.id.btn_donorlogin);
        btn_donersign = findViewById(R.id.btn_donersign);

    }
}