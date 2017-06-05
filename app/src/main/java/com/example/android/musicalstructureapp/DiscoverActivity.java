package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by MariamNKinene on 04/06/2017.
 */

public class DiscoverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        // Create ArrayList of playlist categories
        ArrayList<Discover> playLists = new ArrayList<Discover>();
        playLists.add(new Discover("KIDANDALI", "One of the most stylist genres native to Uganda"));
        playLists.add(new Discover("KADONGO KAMU", "The other most old mainstream genres native to Uganda"));
        playLists.add(new Discover("RAP", "Newest genre widely practiced in Uganda"));
        playLists.add(new Discover("ABAKYAALA", "Uganda's most beautiful vocals from the best Women"));
        playLists.add(new Discover("ABAAMI", "Uganda's most beautiful vocals from the best Men"));
        playLists.add(new Discover("GOSPEL", "Uganda's all time favorite songs of praise"));


        // Find the View that shows the discover list
        ListView listView = (ListView) findViewById(R.id.genre_list);

        // Create PlayListAdapter object to display listview
        DiscoverAdapter playListAdapter = new DiscoverAdapter(this, playLists);
        listView.setAdapter(playListAdapter);

        // Set a click listener on that View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                // Create a new intent
                Intent intent = new Intent(DiscoverActivity.this, SongActivity.class);
                // Start the new activity
                startActivity(intent);
            }
        });
        }}