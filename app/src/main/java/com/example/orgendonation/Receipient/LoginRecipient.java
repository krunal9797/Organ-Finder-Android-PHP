package com.example.orgendonation.Receipient;



import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.orgendonation.API.ApiHandler;
import com.example.orgendonation.Donor.DashboardDonor;
import com.example.orgendonation.Donor.LoginDonor;
import com.example.orgendonation.MainActivity;
import com.example.orgendonation.Model.DonorLoginModel;
import com.example.orgendonation.Model.ReceiptsLoginModel;
import com.example.orgendonation.R;
import com.google.android.material.textfield.TextInputEditText;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;


public class LoginRecipient extends AppCompatActivity
{
    TextInputEditText r_email,r_pass;
    Button btn_recipientLogin,btn_recReg;
    TextView tv_forgotpassword;
    String email= null,pass = null,name=null;
    SharedPreferences sharedPreferences;
    Context ctx = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_recipient);
        AllocateMemory();
        Setevent();
    }

    private void Setevent() {
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        btn_recipientLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                email = r_email.getText().toString();
                pass = r_pass.getText().toString();
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
                    r_email.setError("Enter Email");
                    loginsuccess = false;
                }
                else if (pass.equals(""))
                {
                    r_pass.setError("Enter Password");
                    loginsuccess = false;
                }
                else if (loginsuccess==true)
                {
                    ApiHandler.getApiService().rlog(r_email.getText().toString(), r_pass.getText().toString(), new Callback<ReceiptsLoginModel>()
                    {
                        @Override
                        public void success(ReceiptsLoginModel receiptsLoginModel, Response response)
                        {
                            String value = new String(((TypedByteArray) response.getBody()).getBytes());

                            if (value.contains("success"))
                            {
                                editor.clear();
                                editor.putString("sharedName",name);
                                editor.putString("sharedEmail", email);
                                editor.putString("sharedPass", pass);
                                editor.apply();
                                Intent i = new Intent(LoginRecipient.this, DashBoardRecipient.class);
                                i.putExtra("Email",email);
                                i.putExtra(name,name);
                                startActivity(i);
                                Toast.makeText(ctx, "Successful", Toast.LENGTH_SHORT).show();
                            }
                            else if (value.contains("incorrect"))
                            {
                                r_pass.setError("Incorrect Password");
                                Toast.makeText(ctx, "Password Incorrect", Toast.LENGTH_LONG).show();
                            }
                            else if (value.contains("not found"))
                            {
                                r_email.setError("User Not Found");
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


        btn_recReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent recReg = new Intent(getApplicationContext(),RegisterRecipient.class);
                startActivity(recReg);
            }
        });

    }

    private void AllocateMemory()
    {
        sharedPreferences = getApplicationContext().getSharedPreferences("Pref", 0);
        r_email = findViewById(R.id.r_email);
        r_pass = findViewById(R.id.r_pass);
        tv_forgotpassword = findViewById(R.id.tv_forgotpassword);
        btn_recipientLogin = findViewById(R.id.btn_recipientLogin);
        btn_recReg = findViewById(R.id.btn_recReg);

    }
}