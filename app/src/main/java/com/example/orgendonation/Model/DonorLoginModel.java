package com.example.orgendonation.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import java.util.List;

public class DonorLoginModel
{
    @SerializedName("result")
    @Expose
    private List<DonorLoginResult> results =null;
    
    public List<DonorLoginResult> getResults() 
    {
        return results;
    }

    public void setResults(List<DonorLoginResult> results) 
    {
        this.results = results;
    }

}
