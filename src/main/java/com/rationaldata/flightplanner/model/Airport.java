package com.rationaldata.flightplanner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Airport {
    @Id
    @GeneratedValue
    @JsonIgnore
    private int id;
    private String airportCode;
    private String airportCity;


    public Airport() {
    }

    public Airport(String airportCode, String airportCity) {
        this.airportCode = airportCode;
        this.airportCity = airportCity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer airportId) {
        this.id = id;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getAirportCity() {
        return airportCity;
    }

    public void setAirportCity(String airportCity) {
        this.airportCity = airportCity;
    }




}
