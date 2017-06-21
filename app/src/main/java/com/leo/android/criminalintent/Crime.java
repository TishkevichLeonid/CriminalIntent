package com.leo.android.criminalintent;


import java.util.Date;
import java.util.UUID;

/**
 * Created by leonidtiskevic on 10.04.17.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private Date mTime;
    private boolean mSolved;

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id){
        mId = id;
        mDate = new Date();
        mTime = new Date();
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public Date getTime() {
        return mTime;
    }

    public void setTime(Date time) {
        mTime = time;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
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
