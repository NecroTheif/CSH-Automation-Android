package com.example.svaswani.csh_automation_android;

/**
 * Created by svaswani on 2/23/2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.svaswani.csh_automation_android.Models.AutomationResponseModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoungeFragment extends Fragment {

    private LinearLayout mBaseLayout;
    public String token = "E94NE43NMIIXXVVO2YST";

    /**
     * Define how this fragment should appear when it's rendered.
     *
     * @return The view of this fragment.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Toast.makeText(getContext(), "Hi", Toast.LENGTH_LONG).show();
        mBaseLayout = (LinearLayout) inflater.inflate(R.layout.lounge_fragment, container, false);
        Button testButton = (Button) mBaseLayout.findViewById(R.id.test_button);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Clicked.");
                Call<AutomationResponseModel> call = CSHAutomationAPIClient.getClient().togglePower(token, true);
                call.enqueue(new Callback<AutomationResponseModel>() {
                    @Override
                    public void onResponse(Call<AutomationResponseModel> call, Response<AutomationResponseModel> response) {
                        System.out.println("Success.");
                    }

                    @Override
                    public void onFailure(Call<AutomationResponseModel> call, Throwable t) {
                        System.out.println("Fail.");
                    }
                });

            }

        });

        return mBaseLayout;
    }
}

