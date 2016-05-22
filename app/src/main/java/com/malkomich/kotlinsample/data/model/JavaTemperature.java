package com.malkomich.kotlinsample.data.model;

import java.io.Serializable;

/**
 * Created by malkomich on 22/05/2016.
 */
public class JavaTemperature implements Serializable {

    private long id;
    private float min;
    private float max;
    private float night;
    private float eve;
    private float morn;

    public JavaTemperature(long id, float min, float max, float night, float eve, float morn) {
        this.id = id;
        this.min = min;
        this.max = max;
        this.night = night;
        this.eve = eve;
        this.morn = morn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public float getNight() {
        return night;
    }

    public void setNight(float night) {
        this.night = night;
    }

    public float getEve() {
        return eve;
    }

    public void setEve(float eve) {
        this.eve = eve;
    }

    public float getMorn() {
        return morn;
    }

    public void setMorn(float morning) {
        this.morn = morn;
    }

    @Override
    public String toString() {
        return "JavaTemperature{" +
            "id=" + id +
            ", min=" + min +
            ", max=" + max +
            ", night=" + night +
            ", eve=" + eve +
            ", morn=" + morn +
            "}";
    }
}
