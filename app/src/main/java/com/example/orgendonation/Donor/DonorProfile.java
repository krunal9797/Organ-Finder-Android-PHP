package com.example.orgendonation.Donor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.orgendonation.R;


public class DonorProfile extends AppCompatActivity
{
    LinearLayout up_profile,pro_changepss;
    ImageView iv_donor,iv_recipient;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_profile);
        AllocateMemory();
        setEvents();
    }

    private void setEvents()
    {
        up_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile = new Intent(getApplicationContext(),UpdateProfileDonor.class);
                startActivity(profile);
            }
        });
        pro_changepss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changepass = new Intent(getApplicationContext(),ChangePasswordDonor.class);
                startActivity(changepass);
            }
        });
    }

    private void AllocateMemory()
    {
        up_profile = findViewById(R.id.up_profile);
        pro_changepss = findViewById(R.id.pro_changepss);
    }
}