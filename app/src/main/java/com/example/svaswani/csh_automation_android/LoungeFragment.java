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

public class LoungeFragment extends Fragment {

    private LinearLayout mBaseLayout;

    /**
     * Define how this fragment should appear when it's rendered.
     * @return The view of this fragment.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Toast.makeText(getContext(), "Hi", Toast.LENGTH_LONG).show();
        mBaseLayout = (LinearLayout) inflater.inflate(R.layout.lounge_fragment, container, false);
        Button aButton = (Button) mBaseLayout.findViewById(R.id.test_button);
        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Clicked.");
            }
        });

        return mBaseLayout;
    }
}
