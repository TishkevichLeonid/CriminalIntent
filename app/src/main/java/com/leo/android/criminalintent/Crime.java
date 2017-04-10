package com.leo.android.criminalintent;

import java.util.UUID;

/**
 * Created by leonidtiskevic on 10.04.17.
 */

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
