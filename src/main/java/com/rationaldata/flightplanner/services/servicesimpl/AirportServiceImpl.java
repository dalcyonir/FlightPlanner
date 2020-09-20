package com.rationaldata.flightplanner.services.servicesimpl;

import com.rationaldata.flightplanner.model.Airport;
import com.rationaldata.flightplanner.repository.AirportRepository;
import com.rationaldata.flightplanner.services.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportServiceImpl implements AirportService {

    private AirportRepository airportRepository;

    @Autowired
    public AirportServiceImpl(AirportRepository airportRepository){
        this.airportRepository = airportRepository;
    }

    public Airport getAirportByAirportCode(String airportCode){
       return airportRepository.findByAirportCode(airportCode);
    }

}
