package com.example.orgendonation.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RecipientRequestModel
{
    @SerializedName("result")
    @Expose
    private List<RecipientRequestResult> results =null;

    public List<RecipientRequestResult> getResults()
    {
        return results;
    }

    public void setResults(List<RecipientRequestResult> results)
    {
        this.results = results;
    }
}
