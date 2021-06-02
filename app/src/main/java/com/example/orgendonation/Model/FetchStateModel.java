package com.example.orgendonation.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FetchStateModel
{
    @SerializedName("result")
    @Expose

    private List<FetchStateResult> results=null;

    public List<FetchStateResult> getResults()
    {
        return results;
    }
    public void setResults(List<FetchStateResult> results)
    {
        this.results = results;
    }
}
