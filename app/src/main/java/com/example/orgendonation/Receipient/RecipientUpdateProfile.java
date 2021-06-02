package com.example.orgendonation.Receipient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.orgendonation.Donor.DashboardDonor;
import com.example.orgendonation.R;
import com.google.android.material.textfield.TextInputEditText;


public class RecipientUpdateProfile extends AppCompatActivity {
    TextInputEditText edt_fname,edt_email,edt_Contactnumber,edt_BloodGroup;
    Button btn_updateprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipient_update_profile);
        AllocateMemory();
        Setevent();
    }

    private void Setevent() {
        btn_updateprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"update profile successfully",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), DashBoardRecipient.class);
                startActivity(i);
            }
        });
    }

    private void AllocateMemory() {
        edt_fname = findViewById(R.id.edt_fname);
        edt_email = findViewById(R.id.edt_email);
        edt_Contactnumber = findViewById(R.id.edt_Contactnumber);
        edt_BloodGroup = findViewById(R.id.edt_BloodGroup);
        btn_updateprofile = findViewById(R.id.btn_updateprofile);
    }
}