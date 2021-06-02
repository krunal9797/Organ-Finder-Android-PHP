package com.example.orgendonation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.orgendonation.API.ApiHandler;
import com.example.orgendonation.Model.SpinnerModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
{
    private ArrayList<SpinnerModel> goodModelArrayList;
    private ArrayList<String> orgens = new ArrayList<String>();
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spCompany);
        fetchJSON();
    }

    private void fetchJSON()
    {
        ApiHandler.getApiService().getJSONString(new Callback<FetchBloodOrgan>()
        {
            @Override
            public void onResponse(Call<FetchBloodOrgan> call, Response<FetchBloodOrgan> response)
            {
                Log.i("Responsestring", response.body().toString());
                //Toast.makeText()
                if (response.isSuccessful())
                {
                    if (response.body() != null)
                    {
                        Log.i("onSuccess", response.body().toString());
                        String jsonresponse = response.body().toString();
                        spinJSON(jsonresponse);
                    }

                    else
                        {
                            Log.i("onEmptyResponse", "Returned empty response");//Toast.makeText(getContext(),"Nothing returned",Toast.LENGTH_LONG).show();
                        }
                }
            }

            @Override
            public void onFailure(Call<FetchBloodOrgan> call, Throwable t)
            {
                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void spinJSON(String jsonresponse)
    {
        try {

            JSONObject obj = new JSONObject(jsonresponse);
            if(obj.optString("status").equals("true")){

                goodModelArrayList = new ArrayList<>();
                JSONArray dataArray  = obj.getJSONArray("data");

                for (int i = 0; i < dataArray.length(); i++) {

                    SpinnerModel spinnerModel = new SpinnerModel();
                    JSONObject dataobj = dataArray.getJSONObject(i);

                    spinnerModel.setOrgens_name(dataobj.getString("name"));

                    goodModelArrayList.add(spinnerModel);

                }

                for (int i = 0; i < goodModelArrayList.size(); i++){
                    orgens.add(goodModelArrayList.get(i).getOrgens_name().toString());
                }

                ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, orgens);
                spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
                spinner.setAdapter(spinnerArrayAdapter);

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }


}


