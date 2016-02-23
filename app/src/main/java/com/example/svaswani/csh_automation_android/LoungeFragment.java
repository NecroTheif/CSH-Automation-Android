package com.example.svaswani.csh_automation_android;

/**
 * Created by svaswani on 2/23/2016.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LoungeFragment extends Fragment {

    private TextView mExampleView;

    public LoungeFragment() {

//        mExampleView = new TextView(getContext());
//        mExampleView.setText("Hello, Lounge!");
    }

    /**
     * Define how this fragment should appear when it's rendered.
     * @return The view of this fragment.
     */
//    @Nullable
//    @Override
//    public View getView() {
//        return mExampleView;
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lounge_fragment, container,
                false);

        return rootView;
    }
}


