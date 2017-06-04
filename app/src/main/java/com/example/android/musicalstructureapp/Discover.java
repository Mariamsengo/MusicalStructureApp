package com.example.android.musicalstructureapp;

/**
 * Created by MariamNKinene on 01/06/2017.
 */

public class Discover {
    private String mCategoryName;
    private String mCategoryDescription;

    // Create new playlist object
    // @param categoryName is the name of the playlist category
    // @param categoryDescription is the description of the playlist category
    public Discover(String categoryName, String categoryDescription){
        mCategoryName = categoryName;
        mCategoryDescription = categoryDescription;
    }

    // Get the name of the playlist category and return it
    public String getCategoryName() {
        return mCategoryName;
    }

    // Get the description of the playlist category and return it
    public String getCategoryDescription() {
        return mCategoryDescription;
    }

}
