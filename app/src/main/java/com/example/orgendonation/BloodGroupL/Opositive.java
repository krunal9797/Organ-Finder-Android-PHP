package com.example.orgendonation.BloodGroupL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.orgendonation.Fetch.FetchOPEyes;
import com.example.orgendonation.Fetch.FetchOPHeart;
import com.example.orgendonation.Fetch.FetchOPKidney;
import com.example.orgendonation.Fetch.FetchOPLiver;
import com.example.orgendonation.Fetch.FetchOPLung;
import com.example.orgendonation.R;
import com.example.orgendonation.Receipient.SearchDonor;

public class Opositive extends AppCompatActivity
{
    LinearLayout eyes,heart,lung,kidney,liver,iv_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opositive);
        allocatememory();
        setEvenets();
    }
    private void setEvenets()
    {
        eyes.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent eyes = new Intent(getApplicationContext(), FetchOPEyes.class);
                startActivity(eyes);
            }
        });
        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent heart = new Intent(getApplicationContext(), FetchOPHeart.class);
                startActivity(heart);

            }
        });
        lung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lung = new Intent(getApplicationContext(), FetchOPLung.class);
                startActivity(lung);

            }
        });
        kidney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kidney = new Intent(getApplicationContext(), FetchOPKidney.class);
                startActivity(kidney);

            }
        });
        liver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liver = new Intent(getApplicationContext(), FetchOPLiver.class);
                startActivity(liver);

            }
        });

        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent search = new Intent(getApplicationContext(), SearchDonor.class);
                startActivity(search);
            }
        });
    }

    private void allocatememory()
    {
        eyes = findViewById(R.id.eyes);
        heart = findViewById(R.id.heart);
        lung = findViewById(R.id.lung);
        kidney = findViewById(R.id.kidney);
        liver = findViewById(R.id.liver);
        iv_back = findViewById(R.id.Ll_Logout);
    }
}
