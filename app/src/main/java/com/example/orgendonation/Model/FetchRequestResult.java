package com.example.orgendonation.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FetchRequestResult
{

    @SerializedName("r_name")
    @Expose
    private String r_name;


    @SerializedName("r_cnum")
    @Expose
    private String r_cnum;

    @SerializedName("r_orgen")
    @Expose
    private String r_orgen;

    @SerializedName("r_bloodgroup")
    @Expose
    private String r_bloodgroup;

    @SerializedName("r_disease")
    @Expose
    private String r_disease;

    @SerializedName("r_description")
    @Expose
    private String r_description;

    public String getR_name()
    {
        return r_name;
    }
    public void setR_name(String r_name)
    {
        this.r_name = r_name;
    }

    public String getR_cnum()
    {
        return r_cnum;
    }
    public void setR_cnum(String r_cnum)
    {
        this.r_cnum = r_cnum;
    }
    public String getR_orgen()
    {
        return r_orgen;
    }
    public void setR_orgen(String r_orgen)
    {
        this.r_orgen = r_orgen;
    }
    public String getR_bloodgroup()
    {
        return r_bloodgroup;
    }
    public void setR_bloodgroup(String r_bloodgroup)
    {
        this.r_bloodgroup = r_bloodgroup;
    }
    public String getR_disease()
    {
        return r_disease;
    }
    public void setR_disease(String r_disease)
    {
        this.r_bloodgroup = r_bloodgroup;
    }
    public String getR_description()
    {
        return r_description;
    }
    public void setR_description(String r_description)
    {
        this.r_description = r_description;
    }
}
