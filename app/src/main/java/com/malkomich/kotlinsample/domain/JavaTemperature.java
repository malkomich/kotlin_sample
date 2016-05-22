package com.malkomich.kotlinsample.domain;

import java.io.Serializable;

/**
 * Created by malkomich on 22/05/2016.
 */
public class JavaTemperature implements Serializable {

    private long id;
    private float min;
    private float max;
    private float night;
    private float evening;
    private float morning;

    public JavaTemperature(long id, float min, float max, float night, float evening, float morning) {
        this.id = id;
        this.min = min;
        this.max = max;
        this.night = night;
        this.evening = evening;
        this.morning = morning;
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

    public float getEvening() {
        return evening;
    }

    public void setEvening(float evening) {
        this.evening = evening;
    }

    public float getMorning() {
        return morning;
    }

    public void setMorning(float morning) {
        this.morning = morning;
    }

    public String toString() {
        return "JavaTemperature{" +
            "id=" + id +
            ", min=" + min +
            ", max=" + max +
            ", night=" + night +
            ", evening=" + evening +
            ", morning=" + morning +
            "}";
    }
}
