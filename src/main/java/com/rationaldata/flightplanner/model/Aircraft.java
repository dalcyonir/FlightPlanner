package com.rationaldata.flightplanner.model;
//
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;
//import java.util.List;
//
@Entity
public class Aircraft {

    @Id
    @GeneratedValue
    @JsonIgnore
    private int id;
    private String aircraftName;



    public Aircraft() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }




}
