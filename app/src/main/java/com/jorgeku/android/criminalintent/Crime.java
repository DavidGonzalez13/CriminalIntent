package com.jorgeku.android.criminalintent;


import java.util.Date;
import java.util.UUID;

/**
 * Created by david on 29/11/2017.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private Boolean mSolved;

    public Crime (){

        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public Boolean isSolved() {
        return mSolved;
    }

    public void setmSolved(Boolean mSolved) {
        this.mSolved = mSolved;
    }
}
