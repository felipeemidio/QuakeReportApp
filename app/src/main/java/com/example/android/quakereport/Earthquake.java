package com.example.android.quakereport;

public class Earthquake {

    double magnitude;
    String location;
    private long mTimeInMilliseconds;
    /** Website URL of the earthquake */
    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        this.magnitude = magnitude;
        this.location = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }


    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }

}
