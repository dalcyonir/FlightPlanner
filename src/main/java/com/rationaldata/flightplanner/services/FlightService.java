package com.rationaldata.flightplanner.services;

import com.rationaldata.flightplanner.model.Airport;
import com.rationaldata.flightplanner.model.Flight;

import java.time.LocalDate;
import java.util.List;

public interface FlightService {
    public abstract List<Flight> getAllFlights();
    public abstract List<Flight> getAllFlightsByOriginAirport(Airport depAirport);

}
