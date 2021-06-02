package com.example.orgendonation.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReceipientsRegModel {

    @SerializedName("result")
    @Expose
    private List<ReceipientRegResult> results =null;

    public List<ReceipientRegResult> getResults()
    {
        return results;
    }

    public void setResults(List<ReceipientRegResult> results)
    {
        this.results = results;
    }
}
