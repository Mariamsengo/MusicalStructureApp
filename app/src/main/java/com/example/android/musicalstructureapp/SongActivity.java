package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by MariamNKinene on 04/06/2017.
 */

public class SongActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);


        // Find the View that shows the song button
        Button song = (Button) findViewById(R.id.textView);

        // Set a click listener on that View
        song.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@Link DiscoverActivity}
                Intent nowplayinhIntent = new Intent(SongActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(nowplayinhIntent);
            }
        });
}}
