package com.example.orgendonation.Donor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orgendonation.Adapter.ViewStateAdapter;
import com.example.orgendonation.FetchRequestActivity;
import com.example.orgendonation.FetchStateActivity;
import com.example.orgendonation.R;
import com.example.orgendonation.Receipient.RequestDonor;


public class DashboardDonor extends AppCompatActivity
{
    View bg_top_header;
    ImageView iv_user,iv_Home,iv_Profile,iv_Request,iv_Inquiry,iv_Aboutus,iv_Logout;
    TextView txt_username,txt_email;
    String username,password;
    SharedPreferences sharedPreferences;
    LinearLayout Ll_Home,Ll_profile,Ll_Request,Ll_Inquiry,Ll_Aboutus,Ll_Logout,Ll_FindNearHospital;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_donor);
        AllocateMemory();
        Setevent();
    }

    private void Setevent()
    {

        txt_email.setText(getIntent().getExtras().getString("sharedEmail",username));
//        txt_username.setText(getIntent().getExtras().getString("Name",password));

        Ll_Home.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent home = new Intent(getApplicationContext(),DonorHome.class);
                startActivity(home);
//                Toast.makeText(getApplicationContext(),"home button click",Toast.LENGTH_SHORT).show();
            }
        });
        Ll_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dprofile = new Intent(getApplicationContext(),DonorProfile.class);
                startActivity(dprofile);
                //Toast.makeText(getApplicationContext(),"profile button click",Toast.LENGTH_SHORT).show();
            }
        });
        Ll_Request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent response = new Intent(getApplicationContext(), FetchStateActivity.class);
                startActivity(response);
                //Toast.makeText(getApplicationContext(),"request button click",Toast.LENGTH_SHORT).show();
            }
        });
        Ll_FindNearHospital.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent response = new Intent(getApplicationContext(),NearByHospitalsDonor.class);
                startActivity(response);
              //  Toast.makeText(getApplicationContext(),"Hospital",Toast.LENGTH_SHORT).show();
            }
        });
        Ll_Aboutus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent aboutus = new Intent(getApplicationContext(),DonerAboutUs.class);
                startActivity(aboutus);
                Toast.makeText(getApplicationContext(),"about us button click",Toast.LENGTH_SHORT).show();
            }
        });
        Ll_Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent logindoner = new Intent(getApplicationContext(),LoginDonor.class);
                startActivity(logindoner);
                Toast.makeText(getApplicationContext(),"logout button click",Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void AllocateMemory() {
        sharedPreferences = getApplicationContext().getSharedPreferences("Pref", 0);
        bg_top_header = findViewById(R.id.bg_top_header);
        iv_user = findViewById(R.id.iv_user);
        iv_Home = findViewById(R.id.iv_Home);
        iv_Profile = findViewById(R.id.iv_Profile);
        iv_Aboutus = findViewById(R.id.iv_Aboutus);
        iv_Logout = findViewById(R.id.iv_Logout);
        Ll_Home = findViewById(R.id.Ll_Home);
        Ll_profile = findViewById(R.id.Ll_profile);
        Ll_Request = findViewById(R.id.Ll_Request);
        Ll_FindNearHospital = findViewById(R.id.Ll_FindNearHospital);
        Ll_Aboutus = findViewById(R.id.Ll_Aboutus);
        Ll_Logout = findViewById(R.id.Ll_Logout);
        txt_email = findViewById(R.id.txt_email);
    }

}