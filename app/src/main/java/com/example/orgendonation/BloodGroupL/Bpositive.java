package com.example.orgendonation.BloodGroupL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.orgendonation.Fetch.FetchBPEyes;
import com.example.orgendonation.Fetch.FetchBPHeart;
import com.example.orgendonation.Fetch.FetchBPKidney;
import com.example.orgendonation.Fetch.FetchBPLiver;
import com.example.orgendonation.Fetch.FetchBPLung;
import com.example.orgendonation.R;
import com.example.orgendonation.Receipient.SearchDonor;

public class Bpositive extends AppCompatActivity {
    LinearLayout eyes,heart,lung,kidney,liver,iv_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bpositive);
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
                Intent eyes = new Intent(getApplicationContext(), FetchBPEyes.class);
                startActivity(eyes);
            }
        });
        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent heart = new Intent(getApplicationContext(), FetchBPHeart.class);
                startActivity(heart);

            }
        });
        lung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lung = new Intent(getApplicationContext(), FetchBPLung.class);
                startActivity(lung);

            }
        });
        kidney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kidney = new Intent(getApplicationContext(), FetchBPKidney.class);
                startActivity(kidney);

            }
        });
        liver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liver = new Intent(getApplicationContext(), FetchBPLiver.class);
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