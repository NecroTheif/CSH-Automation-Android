package com.example.svaswani.csh_automation_android;

import retrofit.RestAdapter;

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
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint("https://control.csh.rit.edu/lounge/") // csh-automation api url
                    .build();

            cshAutomationService = restAdapter.create(CSHAutomationApiInterface.class);
        }

        return cshAutomationService;
    }

    // all api calls go here inside the interface
    public interface CSHAutomationApiInterface {

    }
}
