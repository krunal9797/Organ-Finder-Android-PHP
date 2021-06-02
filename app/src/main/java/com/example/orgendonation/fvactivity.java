package com.example.orgendonation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class fvactivity extends AppCompatActivity
{
    TextView row_name,row_bloodgroup,row_cnum,row_disease;
    Context ctx = this;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fvactivity);

        row_name = findViewById(R.id.row_name);
        row_bloodgroup = findViewById(R.id.row_bloodgroup);
        row_cnum = findViewById(R.id.row_cnum);
        row_disease = findViewById(R.id.row_disease);

        row_name.setText(getIntent().getStringExtra("Name"));
        row_bloodgroup.setText(getIntent().getStringExtra("Contact"));
        row_cnum.setText(getIntent().getStringExtra("blood"));
        row_disease.setText(getIntent().getStringExtra("disease"));
        row_cnum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String number=row_cnum.getText().toString();
                int permissionCheck = ContextCompat.checkSelfPermission(fvactivity.this, Manifest.permission.CALL_PHONE);

                if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(fvactivity.this, new String[]{Manifest.permission.CALL_PHONE},
                            123);
                } else {
                    startActivity(new Intent(Intent.ACTION_CALL).setData(Uri.parse("tel:"+number)));
                }
            }
        });

    }
}