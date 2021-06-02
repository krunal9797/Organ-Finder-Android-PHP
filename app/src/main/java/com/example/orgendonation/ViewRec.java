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

public class ViewRec extends AppCompatActivity
{
    TextView donorName,bloodgroup,donorContact,organs;
    Context ctx = this;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_rec);
        allocatememory();
    }

    private void allocatememory()
    {
        donorName = findViewById(R.id.donorName);
        bloodgroup = findViewById(R.id.bloodgroup);
        donorContact = findViewById(R.id.donorContact);
        organs = findViewById(R.id.organs);

        donorName.setText(getIntent().getStringExtra("Name"));
        donorContact.setText(getIntent().getStringExtra("Contact"));
        bloodgroup.setText(getIntent().getStringExtra("Blood"));
        organs.setText(getIntent().getStringExtra("Organ"));

        donorContact.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String number=donorContact.getText().toString();
                int permissionCheck = ContextCompat.checkSelfPermission(ViewRec.this, Manifest.permission.CALL_PHONE);

                if (permissionCheck != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(ViewRec.this, new String[]{Manifest.permission.CALL_PHONE},
                            123);
                }
                else
                    {
                        startActivity(new Intent(Intent.ACTION_CALL).setData(Uri.parse("tel:"+number)));
                    }
            }
        });

    }
}