package com.malkomich.kotlinsample.data.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by malkomich on 22/05/2016.
 */
public class JavaForecast implements Serializable {

    private long dt;
    private JavaTemperature temp;
    private float pressure;
    private int humidity;
    private List<JavaWeather> weather;
    private float speed;
    private int deg;
    private int clouds;
    private float rain;

    public JavaForecast(long dt, JavaTemperature temp, float pressure, int humidity, List<JavaWeather>
        weather, float speed, int deg, int clouds, float rain) {

        this.dt = dt;
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.weather = weather;
        this.speed = speed;
        this.deg = deg;
        this.clouds = clouds;
        this.rain =rain;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public JavaTemperature getTemp() {
        return temp;
    }

    public void setTemp(JavaTemperature temp) {
        this.temp = temp;
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

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
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

    @Override
    public String toString() {
        return "JavaForecast{" +
            "dt=" + dt +
            ", temp=" + temp +
            ", pressure=" + pressure +
            ", humidity=" + humidity +
            ", weather=" + weather +
            ", speed=" + speed +
            ", deg=" + deg +
            ", clouds=" + clouds +
            ", rain=" + rain +
            "}";
    }
}
