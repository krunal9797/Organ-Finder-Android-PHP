package com.example.orgendonation.Donor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.orgendonation.R;


public class ChangePasswordDonor extends AppCompatActivity {
    EditText edt_cpassword,edt_Newpassword,edt_repassword;
    Button btn_Updatepassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password_donor);
        AllocateMemory();
    }

    private void AllocateMemory() {
        edt_cpassword = findViewById(R.id.edt_cpassword);
        edt_Newpassword = findViewById(R.id.edt_Newpassword);
        edt_repassword = findViewById(R.id.edt_repassword);
        btn_Updatepassword = findViewById(R.id.btn_Updatepassword);
    }
}