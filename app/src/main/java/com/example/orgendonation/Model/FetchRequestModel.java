package com.example.orgendonation.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FetchRequestModel
{
    @SerializedName("result")
    @Expose
    private List<FetchRequestResult> results =null;

    public List<FetchRequestResult> getResults()
    {
        return results;
    }

    public void setResults(List<FetchRequestResult> results)
    {
        this.results = results;
    }
}
