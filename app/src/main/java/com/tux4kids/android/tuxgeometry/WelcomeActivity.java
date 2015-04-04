package com.tux4kids.android.tuxgeometry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jason Barker on 3/22/2015.
 */
public class WelcomeActivity extends Activity {


    private static final String TAG = "WelcomeFragment";

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_welcome);

        //the buttons on the welcome screen
        Button matchingGameButton;
        Button highScoreButton;
        Button areaGameButton;


        //what happens when the matching game button is clicked in fragment_welcome.xml
        matchingGameButton = (Button) findViewById(R.id.matching_button);
        matchingGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d(TAG, "matchingGameButton clicked");

                sendMessage(MatchingGameActivity.class);

            }
        });

        //what happens when the highScoreGameButton is clicked in fragment_welcome.xml
        highScoreButton = (Button) findViewById(R.id.high_score_button);
        highScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "highScoreButton clicked");

                sendMessage(HighScoreActivity.class);

            }
        });

        //what happens when the areaGameButton is clicked in fragment_welcome.xml
        areaGameButton = (Button) findViewById(R.id.area_button);
        areaGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "areaGameButton clicked");

                sendMessage(AreaGameActivity.class);

            }
        });

    }

    //switch activities to the class given as an input
    protected void sendMessage(Class mClass){
        Intent i = new Intent(this, mClass);
        startActivity(i);

    }
}