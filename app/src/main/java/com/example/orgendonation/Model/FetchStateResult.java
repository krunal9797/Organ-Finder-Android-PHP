package com.example.orgendonation.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FetchStateResult
{
    @SerializedName("state_name")
    @Expose
    private String state_name;

    public String getState_name()
        {
        return state_name ;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }
}
