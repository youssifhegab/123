package com.example.android.quakereport;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Quake {
    private float mMag;
    private String mPlace;
    private Date mDate;
    private Date mTime;
    private String mDistance;
    private String mUrl;

    Quake(float mMag, String mDistance, String mPlace, Date mDate, Date mTime, String mUrl){
        this.mMag = mMag;
        this.mPlace = mPlace;
        this.mDate = mDate;
        this.mDistance = mDistance;
        this.mTime = mTime;
        this.mUrl = mUrl;
    }

    public float getmMag(){
        return mMag;
    }
    public String getmDistance(){
        return mDistance;
    }
    public String getmPlace(){
        return mPlace;
    }
    public String getmDate(){
        DateFormat dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy");
        String strDate = dateFormat.format(mDate);
        return strDate;
    }
    public String getmTime(){
        DateFormat dateFormat = new SimpleDateFormat("h:mm a");
        String strDate = dateFormat.format(mDate);
        return strDate;
    }
    public String getUrl() {
        return mUrl;
    }
}
