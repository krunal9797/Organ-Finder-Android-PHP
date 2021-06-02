package com.example.orgendonation.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReceiptsLoginModel
{
    @SerializedName("result")
    @Expose
    private List<ReceiptsLoginResult> results =null;

    public List<ReceiptsLoginResult> getResults()
    {
        return results;
    }

    public void setResults(List<ReceiptsLoginResult> results)
    {
        this.results = results;
    }
}
