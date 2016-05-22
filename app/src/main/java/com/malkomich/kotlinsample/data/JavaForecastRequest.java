package com.malkomich.kotlinsample.data;

import com.google.gson.Gson;
import com.malkomich.kotlinsample.data.model.JavaForecastResult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by malkomich on 22/05/2016.
 */
public class JavaForecastRequest {

    private static final String TAG = JavaForecastRequest.class.getSimpleName();

    private static final String APP_ID = "15646a06818f61f7b8d7823ca833e1ce";
    private static final String URL =
        "http://api.openweathermap.org/data/2" + ".5/forecast/daily?mode=json&units=metric&cnt=7";
    private static final String COMPLETE_URL = URL + "&APPID=" + APP_ID + "&q=";

    private String zipCode;

    public JavaForecastRequest(String zipCode) {
        this.zipCode = zipCode;
    }

    public JavaForecastResult execute() {
        StringBuilder output = new StringBuilder();

        try {
            URL url = new URL(COMPLETE_URL + zipCode);
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

        Gson gson = new Gson();
        return gson.fromJson(forecastJsonStr, JavaForecastResult.class);

    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
