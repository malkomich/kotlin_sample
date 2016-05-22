package com.malkomich.kotlinsample.domain.model;

import java.io.Serializable;

/**
 * Created by malkomich on 22/05/2016.
 */
public class JavaForecast implements Serializable {

    private String date;
    private String description;
    private int high;
    private int low;

    public JavaForecast(String date, String description, int high, int low) {
        this.date = date;
        this.description = description;
        this.high = high;
        this.low = low;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    @Override
    public String toString() {
        return "JavaForecast{" +
            "date='" + date + "'" +
            ", description='" + description + "'" +
            ", high=" + high +
            ", low=" + low +
            "}";
    }
}
