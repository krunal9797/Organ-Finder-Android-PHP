package com.example.orgendonation.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpdateProfileDonorResult
{
    @SerializedName("d_id")
    @Expose
    private int d_id;

    @SerializedName("d_name")
    @Expose
    private String d_name;

    @SerializedName("d_email")
    @Expose
    private String d_email;

    @SerializedName("d_category")
    @Expose
    private String d_category;

    @SerializedName("d_disease")
    @Expose
    private String d_disease;

    public UpdateProfileDonorResult(int d_id, String d_name, String d_email, String d_category, String d_disease) {
        this.d_id = d_id;
        this.d_name = d_name;
        this.d_email = d_email;
        this.d_category = d_category;
        this.d_disease = d_disease;

    }

    public int getD_id ()
    {
        return d_id;
    }

    public void setD_id() {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_email() {
        return d_email;
    }

    public void setD_email(String d_email) {
        this.d_email = d_email;
    }

    public String getD_category() {
        return d_category;
    }

    public void setD_category(String d_category) {
        this.d_category = d_category;
    }

    public String getD_disease() {
        return d_disease;
    }

    public void setD_disease(String d_disease) {
        this.d_disease = d_disease;
    }
}
