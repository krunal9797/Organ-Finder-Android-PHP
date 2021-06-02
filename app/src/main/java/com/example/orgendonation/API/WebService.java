package com.example.orgendonation.API;

import com.example.orgendonation.FetchBloodOrgan;
import com.example.orgendonation.FetchOrgensActivity;
import com.example.orgendonation.Model.DonorLoginModel;
import com.example.orgendonation.Model.DonorRegModel;
import com.example.orgendonation.Model.FetchBloodOrganModel;
import com.example.orgendonation.Model.FetchRequestModel;
import com.example.orgendonation.Model.FetchRequestResult;
import com.example.orgendonation.Model.FetchStateModel;
import com.example.orgendonation.Model.FetchStateResult;
import com.example.orgendonation.Model.ReceipientsRegModel;
import com.example.orgendonation.Model.ReceiptsLoginModel;
import com.example.orgendonation.Model.RecipientRequestModel;
import com.example.orgendonation.Model.Statemodel;
import com.example.orgendonation.Model.UpdateProfileDonorMOdel;
import com.google.android.material.textfield.TextInputEditText;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit2.Call;

public interface WebService
{

    @GET("/fetchblood.php")
    Call<String> getJSONString(retrofit2.Callback<FetchBloodOrgan> callback);

    @GET("/donorlogin.php")
    public void dr(@Query("d_email") String d_email,
                   @Query("d_pass") String d_pass,
                   Callback<DonorLoginModel> callback);

    @GET("/receipientlogin.php")
    public void rlog(@Query("r_email") String r_email,
                     @Query("r_pass") String r_pass,
                     Callback<ReceiptsLoginModel> callback);

    @GET("/donorreg1.php")
    public void dreg(@Query("d_name") String d_name,
                     @Query("d_email") String d_email,
                     @Query("d_pass") String d_pass,
                     @Query("d_dob") String d_dob,
                     @Query("d_gender") String d_gender,
                     @Query("d_bloodgroup") String d_bloodgroup,
                     @Query("d_disease") String d_disease,
                     @Query("d_state") String d_state,
                     @Query("d_category") String d_category,
                     @Query("d_city") String d_city,
                     @Query("d_contact") String d_contact,
                     Callback<DonorRegModel> callback);

    @GET("/receipientreg.php")
    public void reg(@Query("r_name") String r_name,
                     @Query("r_email") String r_email,
                     @Query("r_pass") String r_pass,
                     @Query("r_dob") String r_dob,
                     @Query("r_gender") String r_gender,
                     @Query("r_bloodgroup") String r_bloodgroup,
                     @Query("r_disease") String r_disease,
                     @Query("r_state") String r_state,
                     @Query("r_category") String r_category,
                     @Query("r_city") String r_city,
                     @Query("r_contact") String r_contact,
                     Callback<ReceipientsRegModel> callback);

    @POST("/fetchstate.php")
    public void viewstate(Callback<FetchStateModel> callback);

    @POST("/donerupdate.php")
    public void updonor(@Query("d_name") TextInputEditText d_name,
                        @Query("d_email") TextInputEditText d_email,
                        @Query("d_category") TextInputEditText d_category,
                        @Query("d_disease") TextInputEditText d_disease,
                        Callback<DonorLoginModel> callback);


    @GET("/requestrec.php")
    public void request(
            @Query("r_name") String r_name,
            @Query("r_cnum") String r_cnum,
            @Query("r_orgen") String r_orgen,
            @Query("r_bloodgroup") String r_bloodgroup,
            @Query("r_disease") String r_disease,
            @Query("r_description") String r_description,
            Callback<RecipientRequestModel> callback);


    @GET("/fetchdonoroandkidney.php")
    public void fbloodorgan(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchrequest.php")
    public void frequest(Callback<FetchRequestModel> callback);

    //o positve and organs


    @GET("/fetchopeyes.php")
    public void fopeyes(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchopheart.php")
    public void fopheart(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchoplung.php")
    public void foplung(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchopkidney.php")
    public void fopkideny(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchopliver.php")
    public void fopliver(Callback<FetchBloodOrganModel> callback);


    //o nagative and organs


    @GET("/fetchoneyes.php")
    public void foneyes(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchonheart.php")
    public void fonheart(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchonlung.php")
    public void fonlung(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchonkidney.php")
    public void fonkidney(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchonliver.php")
    public void fonliver(Callback<FetchBloodOrganModel> callback);

    //A+

    @GET("/fetchapeyes.php")
    public void fapeyes(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchapheart.php")
    public void fapheart(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchaplung.php")
    public void faplung(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchapkidney.php")
    public void fapkideny(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchapliver.php")
    public void fapliver(Callback<FetchBloodOrganModel> callback);

    //A-

    @GET("/fetchaneyes.php")
    public void faneyes(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchanheart.php")
    public void fanheart(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchanlung.php")
    public void fanlung(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchankidney.php")
    public void fankideny(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchanliver.php")
    public void fanliver(Callback<FetchBloodOrganModel> callback);

    //b+

    @GET("/fetchbpeyes.php")
    public void fbpeyes(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchbpheart.php")
    public void fbpheart(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchbplung.php")
    public void fbplung(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchbpkidney.php")
    public void fbpkideny(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchbpliver.php")
    public void fbpliver(Callback<FetchBloodOrganModel> callback);

    //b-

    @GET("/fetchbneyes.php")
    public void fbneyes(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchbnheart.php")
    public void fbnheart(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchbnlung.php")
    public void fbnlung(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchbnkidney.php")
    public void fbnkideny(Callback<FetchBloodOrganModel> callback);

    @GET("/fetchbnliver.php")
    public void fbnliver(Callback<FetchBloodOrganModel> callback);


    //ab+

    @GET("/abpeyes.php")
    public void fabpeyes(Callback<FetchBloodOrganModel> callback);

    @GET("/abpheart.php")
    public void fabpheart(Callback<FetchBloodOrganModel> callback);

    @GET("/abplung.php")
    public void fabplung(Callback<FetchBloodOrganModel> callback);

    @GET("/abpkidney.php")
    public void fabpkideny(Callback<FetchBloodOrganModel> callback);

    @GET("/abpliver.php")
    public void fabpliver(Callback<FetchBloodOrganModel> callback);


    //ab-

    @GET("/abneyes.php")
    public void fabneyes(Callback<FetchBloodOrganModel> callback);

    @GET("/abnheart.php")
    public void fabnheart(Callback<FetchBloodOrganModel> callback);

    @GET("/abnlung.php")
    public void fabnlung(Callback<FetchBloodOrganModel> callback);

    @GET("/abnkidney.php")
    public void fabnkideny(Callback<FetchBloodOrganModel> callback);

    @GET("/abnliver.php")
    public void fabnliver(Callback<FetchBloodOrganModel> callback);


}
