package com.example.orgendonation.Fetch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.example.orgendonation.API.ApiHandler;
import com.example.orgendonation.Adapter.FetchBloodOrganAdapter;
import com.example.orgendonation.Model.FetchBloodOrganModel;
import com.example.orgendonation.Model.FetchBloodOrganResult;
import com.example.orgendonation.R;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class FetchBPEyes extends AppCompatActivity {

    RecyclerView rv_recycler;
    FetchBloodOrganAdapter fetchBloodOrganAdapter;
    private List<FetchBloodOrganResult> fetchBloodOrganResults = new ArrayList<>();
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_b_p_eyes);
        rv_recycler = (RecyclerView) findViewById(R.id.rv_recycler);
        rv_recycler.setHasFixedSize(true);
        getTopProductList();
    }

    private void getTopProductList()
    {

        ApiHandler.getApiService().fbpeyes(new Callback<FetchBloodOrganModel>()
        {
            @Override
            public void success(FetchBloodOrganModel fetchBloodOrganModel, Response response) {
                Toast.makeText(getApplicationContext(), "Done", Toast.LENGTH_SHORT).show();
                fetchBloodOrganResults = fetchBloodOrganModel.getResults();
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),
                        LinearLayoutManager.VERTICAL, false);
                rv_recycler.setLayoutManager(layoutManager);
                fetchBloodOrganAdapter = new FetchBloodOrganAdapter(fetchBloodOrganResults, context);
                rv_recycler.setAdapter(fetchBloodOrganAdapter);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });

    }

}