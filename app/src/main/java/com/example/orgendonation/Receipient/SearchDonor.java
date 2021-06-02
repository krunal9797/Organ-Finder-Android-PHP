package com.example.orgendonation.Receipient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.orgendonation.BloodGroupL.ABnegative;
import com.example.orgendonation.BloodGroupL.ABpositive;
import com.example.orgendonation.BloodGroupL.Anegative;
import com.example.orgendonation.BloodGroupL.Apositive;
import com.example.orgendonation.BloodGroupL.Bnegative;
import com.example.orgendonation.BloodGroupL.Bpositive;
import com.example.orgendonation.BloodGroupL.Onegtive;
import com.example.orgendonation.BloodGroupL.Opositive;
import com.example.orgendonation.R;

public class SearchDonor extends AppCompatActivity
{
    LinearLayout opositive,onegative,apositive,anegative,bpositive,bnegative,abpositive,abnegative;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_donor);
        allocatememory();
        setEvents();
    }

    private void setEvents()
    {
        opositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent op = new Intent(getApplicationContext(), Opositive.class);
                startActivity(op);
            }
        });
        onegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent on = new Intent(getApplicationContext(), Onegtive.class);
                startActivity(on);
            }
        });
        apositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ap = new Intent(getApplicationContext(), Apositive.class);
                startActivity(ap);
            }
        });
        anegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent an = new Intent(getApplicationContext(), Anegative.class);
                startActivity(an);
            }
        });
        bpositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bp = new Intent(getApplicationContext(), Bpositive.class);
                startActivity(bp);
            }
        });
        bnegative.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent bn = new Intent(getApplicationContext(), Bnegative.class);
                startActivity(bn);
            }
        });
        abpositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abp = new Intent(getApplicationContext(), ABpositive.class);
                startActivity(abp);
            }
        });
        abnegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abn = new Intent(getApplicationContext(), ABnegative.class);
                startActivity(abn);
            }
        });
    }

    private void allocatememory()
    {
        opositive = findViewById(R.id.opositive);
        onegative = findViewById(R.id.onegative);

        apositive = findViewById(R.id.apositive);
        anegative = findViewById(R.id.anegative);
        bnegative = findViewById(R.id.bnegative);
        bpositive = findViewById(R.id.bpositive);
        abpositive = findViewById(R.id.abpositive);
        abnegative = findViewById(R.id.abnegative);
    }
}