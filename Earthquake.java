package com.example.android.quakereport;

/**
 * Created by osayi on 8/6/2017.
 */

public class Earthquake {
    /** this field reps magnitude */
    private double mMagnitude;

    /** this field reps city name */
    private String mCityName;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;


    /**
            * Constructs a new {@link Earthquake} object.
  *
          * @param magnitude is the magnitude (size) of the earthquake
  * @param cityName is the location where the earthquake happened
  * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
  *                           earthquake happened
  * @param url is the website URL to find more details about the earthquake
  */
    public Earthquake (double magnitude, String cityName, long timeInMilliseconds, String url) {

        mMagnitude = magnitude;
        mCityName = cityName;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /** Get earthquake magnitude */
    public double getMagnitude() {
        return mMagnitude;
    }
    /** Get earthquake city name */
    public String getCityName()  {
        return mCityName;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }

}
