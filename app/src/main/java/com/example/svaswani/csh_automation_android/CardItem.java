package com.example.svaswani.csh_automation_android;

import android.view.View;

/**
 * Created by nick on 2/24/16.
 */
public class CardItem {

    private String mTitle;
    private String mSubtitle;
    private View.OnClickListener mListener;

    public CardItem(String title, String subtitle, View.OnClickListener listener) {
        mTitle = title;
        mSubtitle = subtitle;
        mListener = listener;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getSubtitle() {
        return mSubtitle;
    }

    public void setSubtitle(String subtitle) {
        mSubtitle = subtitle;
    }

    public View.OnClickListener getOnClickListener() {
        return mListener;
    }

    public void setListener(View.OnClickListener listener) {
        mListener = listener;
    }
}
