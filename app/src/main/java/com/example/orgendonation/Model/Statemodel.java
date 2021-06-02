package com.example.orgendonation.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Statemodel
{
    @SerializedName("state")
    @Expose
    private String state;

    public Statemodel(String state)
    {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
