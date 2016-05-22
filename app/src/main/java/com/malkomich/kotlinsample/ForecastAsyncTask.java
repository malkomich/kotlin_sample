package com.malkomich.kotlinsample;

import android.os.AsyncTask;

import com.malkomich.kotlinsample.domain.commands.JavaRequestForecastCommand;
import com.malkomich.kotlinsample.domain.model.JavaForecastList;

/**
 * Created by malkomich on 22/05/2016.
 */
public class ForecastAsyncTask extends AsyncTask<String, Void, JavaForecastList> {

    OnResultListener listener;

    public ForecastAsyncTask(OnResultListener listener) {
        this.listener = listener;
    }

    @Override
    protected JavaForecastList doInBackground(String... params) {
        JavaRequestForecastCommand command = new JavaRequestForecastCommand(params[0]);
        return command.execute();
    }

    @Override
    protected void onPostExecute(JavaForecastList result) {
        listener.onResult(result);
    }

}
