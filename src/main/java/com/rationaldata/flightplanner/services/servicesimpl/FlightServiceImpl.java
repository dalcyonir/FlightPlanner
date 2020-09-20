package com.rationaldata.flightplanner.services.servicesimpl;

import com.rationaldata.flightplanner.model.Airport;
import com.rationaldata.flightplanner.model.Flight;
import com.rationaldata.flightplanner.repository.FlightRepository;
import com.rationaldata.flightplanner.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    private FlightRepository flightRepository;

    @Autowired
    public FlightServiceImpl(FlightRepository flightRepository){
        this.flightRepository = flightRepository;
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public List<Flight> getAllFlightsByOriginAirport(Airport originAirport) {
        return flightRepository.findAllByOriginAirportEquals(originAirport);
    }

}
