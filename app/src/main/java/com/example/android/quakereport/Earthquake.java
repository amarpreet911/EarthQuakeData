package com.example.android.quakereport;

/**
 * Created by amarpreet911 on 9/26/17.
 */

public class Earthquake {
    private String mMagnitude;
    private String mLocation;
    private String mData;

    public Earthquake(String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mData = date;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmData() {
        return mData;
    }

}
