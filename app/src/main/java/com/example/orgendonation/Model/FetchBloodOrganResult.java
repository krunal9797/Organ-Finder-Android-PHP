package com.example.orgendonation.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FetchBloodOrganResult
{
    @SerializedName("d_name")
    @Expose
    private String d_name;

    @SerializedName("d_email")
    @Expose
    private String d_email;


    @SerializedName("d_dob")
    @Expose
    private String d_dob;


    @SerializedName("d_bloodgroup")
    @Expose
    private String d_bloodgroup;


    @SerializedName("d_disease")
    @Expose
    private String d_disease;

    @SerializedName("d_category")
    @Expose
    private String d_category;

    @SerializedName("d_contact")
    @Expose
    private String d_contact;

  @SerializedName("d_state")
    @Expose
    private String d_state;


  @SerializedName("d_city")
    @Expose
    private String d_city;

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

    public String getD_dob() {
        return d_dob;
    }

    public void setD_dob(String d_dob) {
        this.d_dob = d_dob;
    }

    public String getD_bloodgroup() {
        return d_bloodgroup;
    }

    public void setD_bloodgroup(String d_bloodgroup) {
        this.d_bloodgroup = d_bloodgroup;
    }

    public String getD_disease() {
        return d_disease;
    }

    public void setD_disease(String d_disease) {
        this.d_disease = d_disease;
    }

    public String getD_category() {
        return d_category;
    }

    public void setD_category(String d_category) {
        this.d_category = d_category;
    }

    public String getD_contact() {
        return d_contact;
    }

    public void setD_contact(String d_contact) {
        this.d_contact = d_contact;
    }

    public String getD_state() {
        return d_state;
    }

    public void setD_state(String d_state) {
        this.d_state = d_state;
    }

    public String getD_city() {
        return d_city;
    }

    public void setD_city(String d_city) {
        this.d_city = d_city;
    }
}
