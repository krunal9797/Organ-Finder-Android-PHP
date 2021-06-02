package com.example.orgendonation.Model;

public class Donor
{
    int id;
    String name,email,organs,bloodgorup,r_disease;

    public Donor(int id, String name, String email, String organs, String bloodgorup, String r_disease)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.organs = organs;
        this.bloodgorup = bloodgorup;
        this.r_disease = r_disease;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrgans() {
        return organs;
    }

    public void setOrgans(String organs) {
        this.organs = organs;
    }

    public String getBloodgorup() {
        return bloodgorup;
    }

    public void setBloodgorup(String bloodgorup) {
        this.bloodgorup = bloodgorup;
    }

    public String getR_disease() {
        return r_disease;
    }

    public void setR_disease(String r_disease) {
        this.r_disease = r_disease;
    }
}
