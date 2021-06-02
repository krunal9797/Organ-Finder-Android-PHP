package com.example.orgendonation.API;

import com.google.gson.Gson;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

public class ApiHandler
{
    private static WebService apiService;
   public static final String BASE_URL ="http://192.168.43.41/orgendonation/";

    //public static final String BASE_URL ="https://backmagichat.000webhostapp.com/";
  //  String JSONURL = "https://demonuts.com/Demonuts/JsonTest/Tennis/";
    //public static final String BASE_URL ="http://192.168.0.105/orgendonation/";
    //public static final String BASE_URL ="http://192.168.0.111/orgendonation/";
  //  public static final String BASE_URL ="https://deboned-vectors.000webhostapp.com/";

   // public static final String WS_GET_TOP_PRODUCTS = "https://orgenfinder.000webhostapp.com/fetchstate.php";
    public static WebService getApiService()
    {
        if (apiService == null)
        {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .setEndpoint(BASE_URL)

                    .setConverter(new GsonConverter(new Gson()))
                    .build();
            apiService = restAdapter.create(WebService.class);
            return apiService;
        }
        else
        {
            return apiService;
        }
    }
}
