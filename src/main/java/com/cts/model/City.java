package com.cts.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "city")
public class City
{
    @Id
    private String id;
    private String cityName;
    private double cityDistance;

    public City() {
    }

    public City(String cityName, double cityDistance) {
        this.cityName = cityName;
        this.cityDistance = cityDistance;
    }

    public City(String id, String cityName, double cityDistance) {
        this.id = id;
        this.cityName = cityName;
        this.cityDistance = cityDistance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getCityDistance() {
        return cityDistance;
    }

    public void setCityDistance(double cityDistance) {
        this.cityDistance = cityDistance;
    }
}
