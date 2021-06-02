package com.example.orgendonation.Fetch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.orgendonation.R;

public class OKFetch extends AppCompatActivity
{
    Button eyes,heart,lung,kidney,liver;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_k_fetch);
        allocatememory();
        setEvents();
    }

    private void setEvents()
    {
        eyes.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
        //        Intent eyes = new Intent(getApplicationContext(),FetchOPEyes.class);
                Intent eyes = new Intent(getApplicationContext(),FetchONEyes.class);
                startActivity(eyes);
            }
        });
        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent heart = new Intent(getApplicationContext(),FetchOPHeart.class);
                Intent heart = new Intent(getApplicationContext(),FetchONHeart.class);
                startActivity(heart);
            }
        });
        lung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lung = new Intent(getApplicationContext(),FetchONLung.class);
                startActivity(lung);
            }
        });
        kidney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kideny = new Intent(getApplicationContext(),FetchONKidney.class);
                startActivity(kideny);
            }
        });
        liver.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent liver = new Intent(getApplicationContext(),FetchONLiver.class);
                startActivity(liver);
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
    }
}