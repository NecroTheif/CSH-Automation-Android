package com.example.svaswani.csh_automation_android;

/**
 * Created by svaswani on 2/23/2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GatekeeperFragment extends Fragment {

    /**
     * Define how this fragment should appear when it's rendered.
     * @return The view of this fragment.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        LinearLayout mBaseLayout = (LinearLayout) inflater.inflate(R.layout.gatekeeper_fragment, container, false);
        RecyclerView recyclerView = (RecyclerView) mBaseLayout.findViewById(R.id.gatekeeper_recycler);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter();

        recyclerAdapter.addCard(new CardItem("Open Example Door", "Opens example door", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Clicked Open Door");
                //Call<AutomationResponseModel> call = CSHAutomationAPIClient.getClient().togglePower(token, true);
                //call.enqueue(new Callback<AutomationResponseModel>() {
                //    @Override
                //    public void onResponse(Call<AutomationResponseModel> call, Response<AutomationResponseModel> response) {
                //        System.out.println("Success.");
                //    }

                //    @Override
                //    public void onFailure(Call<AutomationResponseModel> call, Throwable t) {
                //        System.out.println("Fail.");
                //    }
                //});
            }
        }));

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(recyclerAdapter);

        return mBaseLayout;
    }

    public static class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

        private List<CardItem> mItems = new ArrayList<>();

        public static class ViewHolder extends RecyclerView.ViewHolder {

            public CardView mContainer;
            public TextView mTitle;
            public TextView mSubtitle;

            public ViewHolder(CardView view) {
                super(view);
                mContainer = (CardView) view.findViewById(R.id.card_container);
                mTitle = (TextView) view.findViewById(R.id.card_title);
                mSubtitle = (TextView) view.findViewById(R.id.card_subtitle);

                mContainer.setClickable(true);
            }
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            CardView card = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
            return new ViewHolder(card);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            //Populate the views in the ViewHolder
            CardItem card = mItems.get(position);
            holder.mContainer.setOnClickListener(card.getOnClickListener());
            holder.mTitle.setText(card.getTitle());
            holder.mSubtitle.setText(card.getSubtitle());
        }

        @Override
        public int getItemCount() {
            return mItems.size();
        }

        public void addCard(CardItem card) {
            if(card != null) {
                mItems.add(card);
            } else {
                System.out.println("Error, card is null.");
            }
        }
    }
}
