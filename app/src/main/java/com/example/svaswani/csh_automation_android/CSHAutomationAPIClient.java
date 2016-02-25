package com.example.svaswani.csh_automation_android;

import com.example.svaswani.csh_automation_android.Models.AutomationResponseModel;
import com.example.svaswani.csh_automation_android.Models.LightStatusModel;
import com.example.svaswani.csh_automation_android.Models.ProjectorStatusModel;


import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Query;


/**
 * Created by svaswani on 2/16/2016.
 */
public class CSHAutomationAPIClient {
    private static CSHAutomationApiInterface cshAutomationService;

    // hardcode token to test for now
    // private static String token = "";

    // must be an api interface that creates the rest adapter
    public static CSHAutomationApiInterface getClient() {
        if (cshAutomationService == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://control.csh.rit.edu:8080/lounge/") // csh-automation api url
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            cshAutomationService = retrofit.create(CSHAutomationApiInterface.class);
        }

        return cshAutomationService;
    }

    // all api calls go here inside the interface
    public interface CSHAutomationApiInterface {

        // get projector info
        @GET("/lounge/projector")
        Call<ProjectorStatusModel> projectorStatus(@Body RequestBody body);

        // turn projector on and off
        @PUT("/lounge/projector/power")
        Call<AutomationResponseModel> togglePower(@Body RequestBody body);

        // get lights info
        @GET("/lounge/lights/")
        void lightStatus(@Query("token") String token, Callback<LightStatusModel> cb);
    }

}
