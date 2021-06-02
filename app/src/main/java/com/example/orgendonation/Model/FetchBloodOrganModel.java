package com.example.orgendonation.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FetchBloodOrganModel
{
    @SerializedName("result")
    @Expose
    private List<FetchBloodOrganResult> results =null;

    public List<FetchBloodOrganResult> getResults()
    {
        return results;
    }

    public void setResults(List<FetchBloodOrganResult> results)
    {
        this.results = results;
    }
}
