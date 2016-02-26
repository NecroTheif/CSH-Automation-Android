package com.example.svaswani.csh_automation_android;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Nick on 2/26/16.
 */
public class LightActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_lights);

        System.out.println("Created LightActivity");

    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_lights);

        System.out.println("Started LightActivity");

        LinearLayout container = (LinearLayout) findViewById(R.id.lights_container);

        CardView card1 = createCardView(container, new CardItem("Side Lights", "Toggle the lounge side lights", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Clicked side lights");
            }
        }));

        CardView card2 = createCardView(container, new CardItem("Front Lights", "Toggle the lounge front lights", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Clicked front lights");
            }
        }));

        container.addView(card1);
        container.addView(card2);
    }

    private CardView createCardView(ViewGroup container, CardItem item) {

        CardView card = (CardView) getLayoutInflater().inflate(R.layout.card_layout, container, false);
        ((TextView) card.findViewById(R.id.card_title)).setText(item.getTitle());
        ((TextView) card.findViewById(R.id.card_subtitle)).setText(item.getSubtitle());
        card.setOnClickListener(item.getOnClickListener());
        System.out.println("Created card " + item.getTitle());
        return card;
    }
}
