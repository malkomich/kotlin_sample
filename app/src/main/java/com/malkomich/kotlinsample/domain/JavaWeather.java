package com.malkomich.kotlinsample.domain;

import java.io.Serializable;

/**
 * Created by malkomich on 22/05/2016.
 */
public class JavaWeather implements Serializable {

    private long id;
    private String main;
    private String description;
    private String icon;

    public JavaWeather(long id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String toString() {
        return "JavaWeather{" +
            "id=" + id +
            ", main='" + main + "'" +
            ", description='" + description + "'" +
            ", icon='" + icon + "'" +
            "}";
    }
}
