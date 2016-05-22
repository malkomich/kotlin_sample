package com.malkomich.kotlinsample.domain.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by malkomich on 22/05/2016.
 */
public class JavaForecastList implements Serializable {

    private String city;
    private String country;
    private List<JavaForecast> dailyForecast;

    public JavaForecastList(String city, String country, List<JavaForecast> dailyForecast) {
        this.city = city;
        this.country = country;
        this.dailyForecast = dailyForecast;
    }

    public JavaForecast get(int position) {
        return dailyForecast.get(position);
    }

    public int size() {
        return dailyForecast.size();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<JavaForecast> getDailyForecast() {
        return dailyForecast;
    }

    public void setDailyForecast(List<JavaForecast> dailyForecast) {
        this.dailyForecast = dailyForecast;
    }

    @Override
    public String toString() {
        return "JavaForecastList{" +
            "city='" + city + "'" +
            ", country='" + country + "'" +
            ", dailyForecast=" + dailyForecast +
            "}";
    }
}
