package com.example.orgendonation.Receipient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orgendonation.Donor.DonerAboutUs;
import com.example.orgendonation.Donor.DonorHome;
import com.example.orgendonation.Donor.NearByHospitalsDonor;
import com.example.orgendonation.Donor.RegisterDonor;
import com.example.orgendonation.R;


public class DashBoardRecipient extends AppCompatActivity {

    ImageView Ll_Aboutus,iv_Home;
    TextView txt_username,txt_email;
    LinearLayout Ll_Home,Ll_profile,Ll_Request,Ll_FindNearHospital,Ll_Logout,Ll_searchdonor;
    String username,password;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board_recipient);
        AllocateMemory();
        Setevent();

    }

    private void Setevent()
    {
   //     txt_email.setText(getIntent().getExtras().getString("Email",username));

//        txt_email.setText(getIntent().getExtras().getString("Email",username));

        Ll_Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
//                Intent home = new Intent(getApplicationContext(),)
                Intent home = new Intent(getApplicationContext(), DonorHome.class);
                startActivity(home);
//                Toast.makeText(getApplicationContext(),"Home button click",Toast.LENGTH_SHORT).show();
            }
        });
        Ll_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile = new Intent(getApplicationContext(),RecepientProfile.class);
                startActivity(profile);
               Toast.makeText(getApplicationContext(),"profile button click",Toast.LENGTH_SHORT).show();
            }
        });
        Ll_Request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent request = new Intent(getApplicationContext(), RequestDonor.class);
                startActivity(request);
                Toast.makeText(getApplicationContext(),"request button click",Toast.LENGTH_SHORT).show();
            }
        });
        Ll_searchdonor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent request = new Intent(getApplicationContext(), SearchDonor.class);
                startActivity(request);
                Toast.makeText(getApplicationContext(),"request button click",Toast.LENGTH_SHORT).show();
            }
        });
        Ll_FindNearHospital.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent request = new Intent(getApplicationContext(), NearByHospitalsDonor.class);
                startActivity(request);
            }
        });
        Ll_Aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent aboutus = new Intent(getApplicationContext(), DonerAboutUs.class);
                startActivity(aboutus);
                Toast.makeText(getApplicationContext(),"about us button click",Toast.LENGTH_SHORT).show();
            }
        });


        Ll_Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent logout = new Intent(getApplicationContext(), LoginRecipient.class);
                startActivity(logout);
                finish();
                Toast.makeText(getApplicationContext(),"logout success",Toast.LENGTH_SHORT).show();
            }
        });





    }

    private void AllocateMemory() {
        sharedPreferences = getApplicationContext().getSharedPreferences("Pref", 0);
        Ll_Home = findViewById(R.id.Ll_Home);
        Ll_profile = findViewById(R.id.Ll_profile);
        Ll_Request = findViewById(R.id.Ll_Request);
        Ll_FindNearHospital = findViewById(R.id.Ll_FindNearHospital);
        Ll_Aboutus = findViewById(R.id.Ll_Aboutus);
        Ll_Logout = findViewById(R.id.Ll_Logout);
        Ll_searchdonor = findViewById(R.id.Ll_searchdonor);
        txt_email = findViewById(R.id.txt_email);

//        txt_username = findViewById(R.id.txt_username);
    }
}