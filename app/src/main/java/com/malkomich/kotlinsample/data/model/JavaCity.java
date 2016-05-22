package com.malkomich.kotlinsample.data.model;

import java.io.Serializable;

/**
 * Created by malkomich on 22/05/2016.
 */
public class JavaCity implements Serializable {

    private long id;
    private String name;
    private JavaCoordinates coord;
    private String country;
    private int population;

    public JavaCity(long id, String name, JavaCoordinates coord, String country, int population) {
        this.id = id;
        this.name = name;
        this.coord = coord;
        this.country = country;
        this.population = population;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JavaCoordinates getCoord() {
        return coord;
    }

    public void setCoord(JavaCoordinates coord) {
        this.coord = coord;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String toString() {
        return "JavaCity{" +
            "id=" + id +
            ", name='" + name + "'" +
            ", coord=" + coord +
            ", country='" + country + "'" +
            ", population=" + population +
            "}";
    }
}
