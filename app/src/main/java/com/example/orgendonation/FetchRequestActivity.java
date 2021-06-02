package com.example.orgendonation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.example.orgendonation.API.ApiHandler;
import com.example.orgendonation.Adapter.FetchRequestAdapter;
import com.example.orgendonation.Model.FetchRequestModel;
import com.example.orgendonation.Model.FetchRequestResult;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class FetchRequestActivity extends AppCompatActivity {

    ListView listView;
    List<FetchRequestResult> requestResults ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_request);

        listView=(ListView)findViewById(R.id.request_detail);
        requestResults=new ArrayList<>();

        ApiHandler.getApiService().frequest(new Callback<FetchRequestModel>() {
            @Override
            public void success(FetchRequestModel fetchRequestModel, Response response)
            {
                Toast.makeText(FetchRequestActivity.this,"Done",Toast.LENGTH_SHORT).show();

                // Log.d("<>",viewProductModel.getResults().toString());

                requestResults=fetchRequestModel.getResults();
                Log.d("krunal","response");
                FetchRequestAdapter fetchRequestAdapter=new FetchRequestAdapter(getApplicationContext(),requestResults);
                listView.setAdapter(fetchRequestAdapter);

            }

            @Override
            public void failure(RetrofitError error)
            {

            }
        });

    }
}
