package com.malkomich.kotlinsample.domain;

import java.io.Serializable;

/**
 * Created by malkomich on 22/05/2016.
 */
public class JavaCoordinates implements Serializable {

    private float lon;
    private float lat;

    public JavaCoordinates(float lon, float lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public String toString() {
        return "JavaCoordinates{" +
            "lon=" + lon +
            ", lat=" + lat +
            "}";
    }
}
