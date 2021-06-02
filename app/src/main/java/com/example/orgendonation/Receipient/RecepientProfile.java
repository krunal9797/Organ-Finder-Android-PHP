package com.example.orgendonation.Receipient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.orgendonation.R;


public class RecepientProfile extends AppCompatActivity
{
    LinearLayout ll_updatepass,ll_change;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepient_profile);
        AllocateMemory();
        Setevent();

    }

    private void Setevent() {
        ll_updatepass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent upadte = new Intent(getApplicationContext(),RecipientUpdateProfile.class);
                startActivity(upadte);
                Toast.makeText(getApplicationContext(),"recepient profile click",Toast.LENGTH_SHORT).show();
            }
        });

        ll_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent change = new Intent(getApplicationContext(),ReceipientChangeProfilepassword.class);
                startActivity(change);
                Toast.makeText(getApplicationContext(),"recipient change password",Toast.LENGTH_SHORT).show();
            }
        });



    }

    private void AllocateMemory() {
        ll_updatepass = findViewById(R.id.ll_updatepass);
        ll_change = findViewById(R.id.ll_change);
    }
}