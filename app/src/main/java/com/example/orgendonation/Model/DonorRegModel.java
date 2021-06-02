package com.example.orgendonation.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DonorRegModel
{
    @SerializedName("result")
    @Expose
    private List<DonorRegResult> results =null;

    public List<DonorRegResult> getResults()
    {
        return results;
    }

    public void setResults(List<DonorRegResult> results)
    {
        this.results = results;
    }
}
