package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by Dan_Ellis on 9/24/16.
 */
public class Crime {

    private UUID mID;
    private String mTitle;

    public Crime(){
        //generate uniqque identifier
        mID = UUID.randomUUID();
    }

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
