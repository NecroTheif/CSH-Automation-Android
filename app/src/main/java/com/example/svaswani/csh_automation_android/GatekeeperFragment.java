package com.example.svaswani.csh_automation_android;

/**
 * Created by svaswani on 2/23/2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GatekeeperFragment extends Fragment {

    public GatekeeperFragment() {

    }

    /**
     * Define how this fragment should appear when it's rendered.
     * @return The view of this fragment.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.gatekeeper_fragment, container, false);

        return rootView;
    }
}
