package com.malkomich.kotlinsample;

import android.os.AsyncTask;

import com.malkomich.kotlinsample.domain.JavaForecastRequest;

/**
 * Created by malkomich on 22/05/2016.
 */
public class ForecastAsyncTask extends AsyncTask<String, Void, String> {

    OnResultListener listener;

    public ForecastAsyncTask(OnResultListener listener) {
        this.listener = listener;
    }

    @Override
    protected String doInBackground(String... params) {
//        new JavaForecastRequest(params[0]).run();
        return null;
    }

    @Override
    protected void onPostExecute(String result) {
        listener.onResult();
    }

}
