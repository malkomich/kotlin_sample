package com.malkomich.kotlinsample.data.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by malkomich on 22/05/2016.
 */
public class JavaForecast implements Serializable {

    private long date;
    private JavaTemperature temperature;
    private float pressure;
    private int humidity;
    private List<JavaWeather> weather;
    private float speed;
    private int degrees;
    private int clouds;
    private float rain;

    public JavaForecast(long date, JavaTemperature temperature, float pressure, int humidity, List<JavaWeather>
        weather, float speed, int degrees, int clouds, float rain) {

        this.date = date;
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.weather = weather;
        this.speed = speed;
        this.clouds = clouds;
        this.rain =rain;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public JavaTemperature getTemperature() {
        return temperature;
    }

    public void setTemperature(JavaTemperature temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public List<JavaWeather> getWeather() {
        return weather;
    }

    public void setWeather(List<JavaWeather> weather) {
        this.weather = weather;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getDegrees() {
        return degrees;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public float getRain() {
        return rain;
    }

    public void setRain(float rain) {
        this.rain = rain;
    }

    public String toString() {
        return "JavaForecast{" +
            "date=" + date +
            ", temperature=" + temperature +
            ", pressure=" + pressure +
            ", humidity=" + humidity +
            ", weather=" + weather +
            ", speed=" + speed +
            ", degrees=" + degrees +
            ", clouds=" + clouds +
            ", rain=" + rain +
            "}";
    }
}
