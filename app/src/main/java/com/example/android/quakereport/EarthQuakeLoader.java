package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

public class EarthQuakeLoader extends AsyncTaskLoader<List<Quake>> {

    /**
     * Tag for log messages
     */
    private static final String LOG_TAG = EarthQuakeLoader.class.getName();

    /**
     * Query URL
     */
    private String mUrl;


    /**
     * Constructs a new {@link EarthQuakeLoader}.
     *
     * @param context of the activity
     * @param url     to load data from
     */
    public EarthQuakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {


        forceLoad();
    }


    @Override
    public List<Quake> loadInBackground() {


        // Don't perform the request if there are no URLs, or the first URL is null.
        if (mUrl == null) {
            return null;
        }


        // Create a new {@link ArrayAdapter} of earthquakes
        List<Quake> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;

    }


}

