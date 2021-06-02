package com.example.orgendonation.BloodGroupL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.orgendonation.Fetch.FetchABNEyes;
import com.example.orgendonation.Fetch.FetchABNHeart;
import com.example.orgendonation.Fetch.FetchABNKidney;
import com.example.orgendonation.Fetch.FetchABNLiver;
import com.example.orgendonation.Fetch.FetchABNLung;
import com.example.orgendonation.Fetch.FetchABPEyes;
import com.example.orgendonation.Fetch.FetchABPHeart;
import com.example.orgendonation.Fetch.FetchABPKidney;
import com.example.orgendonation.Fetch.FetchABPLiver;
import com.example.orgendonation.Fetch.FetchABPLung;
import com.example.orgendonation.R;
import com.example.orgendonation.Receipient.SearchDonor;

public class ABpositive extends AppCompatActivity
{
    LinearLayout eyes,heart,lung,kidney,liver,iv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_bpositive);
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
                Intent eyes = new Intent(getApplicationContext(), FetchABPEyes.class);
                startActivity(eyes);
            }
        });
        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent heart = new Intent(getApplicationContext(), FetchABPHeart.class);
                startActivity(heart);

            }
        });
        lung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lung = new Intent(getApplicationContext(), FetchABPLung.class);
                startActivity(lung);

            }
        });
        kidney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kidney = new Intent(getApplicationContext(), FetchABPKidney.class);
                startActivity(kidney);

            }
        });
        liver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liver = new Intent(getApplicationContext(), FetchABPLiver.class);
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