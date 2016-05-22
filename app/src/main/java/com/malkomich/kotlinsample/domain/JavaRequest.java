package com.malkomich.kotlinsample.domain;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by malkomich on 22/05/2016.
 */
public class JavaRequest {

    private static final String TAG = JavaRequest.class.getSimpleName();

    private String url;

    public JavaRequest(String url) {
        this.url = url;
    }

    public void run() {
        StringBuilder output = new StringBuilder();

        try {
            URL url = new URL(this.url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String line;
            while ((line = br.readLine()) != null) {
                output.append(line);
            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

        String forecastJsonStr = output.toString();

        Log.d(TAG, forecastJsonStr);

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
