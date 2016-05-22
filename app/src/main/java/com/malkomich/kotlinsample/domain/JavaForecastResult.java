package com.malkomich.kotlinsample.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by malkomich on 22/05/2016.
 */
public class JavaForecastResult implements Serializable {

    private JavaCity city;
    private List<JavaForecast> list;

    public JavaForecastResult(JavaCity city, List<JavaForecast> list) {
        this.city = city;
        this.list = list;
    }

    public JavaCity getCity() {
        return city;
    }

    public void setCity(JavaCity city) {
        this.city = city;
    }

    public List<JavaForecast> getList() {
        return list;
    }

    public void setList(List<JavaForecast> list) {
        this.list = list;
    }

    public String toString() {
        return "JavaForecastResult{" +
            "city=" + city +
            ", list=" + list +
            "}";
    }
}
