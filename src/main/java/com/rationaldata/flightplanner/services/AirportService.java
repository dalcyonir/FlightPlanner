package com.rationaldata.flightplanner.services;

import com.rationaldata.flightplanner.model.Airport;

public interface AirportService {

    public abstract Airport getAirportByAirportCode(String airportCode);
}
