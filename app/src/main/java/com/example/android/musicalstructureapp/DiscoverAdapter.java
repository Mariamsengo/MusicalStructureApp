package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MariamNKinene on 02/06/2017.
 */

public class DiscoverAdapter extends ArrayAdapter<Discover> {

    //  @param context The current context. Used to inflate the layout file
    //  @param playlist A List of playlist objects to display in a list
    public DiscoverAdapter(Activity context, ArrayList<Discover> words) {
        super(context, 0, words);
    }

    // Provides a view for an AdapterView
    //  @param position The position in the list of data that should be displayed in the
    // list item view.
    // @param convertView The recycled view to populate.
    // @param parent The parent ViewGroup that is used for inflation.
    // @return The View for the position in the AdapterView.

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.discoverlist, parent, false);
    }

        // Get the {@link Discover} object located at this position in the list
        Discover currentDiscover = getItem(position);

        // Find the TextView in the discoverlist.xml layout with the ID category_name
        // Get the category name from the current Discover object and
        // set this text on the name TextView
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.category_name);
        nameTextView.setText(currentDiscover.getCategoryName());

        // Find the TextView in the Playlist_item.xml layout with the ID category_description
        // Get the category description from the current Discover object and
        // set this text on the name TextView
        TextView nameTextView2 = (TextView) listItemView.findViewById(R.id.category_description);
        nameTextView2.setText(currentDiscover.getCategoryDescription());

        // Return the whole list item layout (containing 1 ImageView & 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;

    }}
