package com.example.orgendonation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import com.example.orgendonation.API.ApiHandler;
import com.example.orgendonation.Adapter.ViewStateAdapter;
import com.example.orgendonation.Model.FetchRequestModel;
import com.example.orgendonation.Model.FetchRequestResult;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class FetchStateActivity extends AppCompatActivity
{

    RecyclerView rv_recycler;
    ViewStateAdapter productAdapter;
    List<FetchRequestResult> requestResults = new ArrayList<>();
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_state);
        rv_recycler = (RecyclerView) findViewById(R.id.rv_recycler);
        rv_recycler.setHasFixedSize(true);
        getTopProductList();
    }
    private void getTopProductList()
    {
        ApiHandler.getApiService().frequest(new Callback<FetchRequestModel>()
        {
            @Override
            public void success(FetchRequestModel fetchRequestModel, Response response)
            {
                Toast.makeText(FetchStateActivity.this,"Done",Toast.LENGTH_SHORT).show();
                requestResults=fetchRequestModel.getResults();
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(FetchStateActivity.this,
                        LinearLayoutManager.VERTICAL,false);
                rv_recycler.setLayoutManager(layoutManager);
                productAdapter = new ViewStateAdapter(requestResults,context);
                rv_recycler.setAdapter(productAdapter);
            }

            @Override
            public void failure(RetrofitError error)
            {

            }
        });

    }
}