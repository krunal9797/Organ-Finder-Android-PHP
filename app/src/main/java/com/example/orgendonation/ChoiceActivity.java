package com.example.orgendonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.orgendonation.Donor.LoginDonor;
import com.example.orgendonation.Donor.RegisterDonor;
import com.example.orgendonation.Receipient.LoginRecipient;

public class ChoiceActivity extends AppCompatActivity
{
    LinearLayout LL_doner,LL_recipient;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        LL_doner = findViewById(R.id.LL_doner);
        LL_recipient = findViewById(R.id.LL_recipient);

        LL_doner.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent doner  = new Intent(getApplicationContext(), LoginDonor.class);
                startActivity(doner);
            }
        });

        LL_recipient.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent rec  = new Intent(getApplicationContext(), LoginRecipient.class);
                startActivity(rec);
            }
        });
    }
}