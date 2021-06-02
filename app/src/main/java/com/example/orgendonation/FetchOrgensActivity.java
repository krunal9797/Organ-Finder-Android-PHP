package com.example.orgendonation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FetchOrgensActivity extends AppCompatActivity {

    Spinner spinner;
    TextView tv;
    ArrayList<String> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_orgens);
        spinner = (Spinner) findViewById(R.id.orgens_name);
        tv=(TextView)findViewById(R.id.tv);
        //statedetail=(TextView)findViewById(R.id.statedetail);
        //fetchStateResults = new ArrayList<>();
        //Toast.makeText(FetchStateActivity.this,"State....",Toast.LENGTH_LONG).show();

        list=new ArrayList<String>();

        list.add("kidney");
        list.add("heart");
        list.add("eye");
        list.add("kidney");
        list.add("heart");
        list.add("eye");

        final ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //String string=spin2.getSelectedItem().toString();
                // Toast.makeText(Main_Home_Activity.this,string,Toast.LENGTH_SHORT).show();
                String itemText = parent.getItemAtPosition(position).toString();
                tv.setText(itemText);
             /*   if (position == 0)
                {
                    spinner.getItemAtPosition(position);
                    spinner.getSelectedItem().toString();
                    spinner.setSelection(position);

                }*/
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                Toast.makeText(getApplicationContext(),"Fail",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
