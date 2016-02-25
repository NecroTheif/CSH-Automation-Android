package com.example.svaswani.csh_automation_android;

/**
 * Created by svaswani on 2/23/2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.svaswani.csh_automation_android.Models.AutomationResponseModel;
import com.example.svaswani.csh_automation_android.Models.ProjectorStatusModel;
import com.google.common.collect.ImmutableMap;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoungeFragment extends Fragment {

    private LinearLayout mBaseLayout;

    /**
     * Define how this fragment should appear when it's rendered.
     *
     * @return The view of this fragment.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        LinearLayout mBaseLayout = (LinearLayout) inflater.inflate(R.layout.lounge_fragment, container, false);
        RecyclerView recyclerView = (RecyclerView) mBaseLayout.findViewById(R.id.lounge_recycler);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter();

        recyclerAdapter.addCard(new CardItem("Toggle Projector", "Turn the projector on or off", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Clicked Toggle Projector");
                /*Call<ProjectorStatusModel> callProjectorStatus = CSHAutomationAPIClient.getClient().projectorStatus(RequestBodyMaps.getRequestBody(RequestBodyMaps.tokenRequestMap));
                callProjectorStatus.enqueue(new Callback<ProjectorStatusModel>() {
                    @Override
                    public void onResponse(Call<ProjectorStatusModel> call, Response<ProjectorStatusModel> response) {
                        // variable for power state
                        boolean updatedPower = !response.body().projector.getPower();
*/

                Log.i("Test", RequestBodyMaps.getJSON(RequestBodyMaps.powerMap(true)));
                        Call<AutomationResponseModel> callProjectorPower = CSHAutomationAPIClient.getClient().togglePower(RequestBodyMaps.getRequestBody(RequestBodyMaps.powerMap(true)));
                        callProjectorPower.enqueue((new Callback<AutomationResponseModel>() {
                            @Override
                            public void onResponse(Call<AutomationResponseModel> call, Response<AutomationResponseModel> response) {
                                Toast.makeText(getActivity(), "Success", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onFailure(Call<AutomationResponseModel> call, Throwable t) {
                                Toast.makeText(getActivity(), "Fail", Toast.LENGTH_SHORT).show();
                            }
                        }));
                   /* }

                    @Override
                    public void onFailure(Call<ProjectorStatusModel> call, Throwable t) {
                        Toast.makeText(getActivity(), "Fail", Toast.LENGTH_SHORT).show();
                    }
                });*/

            }
        }));

        recyclerAdapter.addCard(new CardItem("Toggle Lights", "Turn the lights on or off", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Clicked Toggle Lights");
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

