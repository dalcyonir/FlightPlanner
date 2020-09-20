package com.rationaldata.flightplanner.repository;

import com.rationaldata.flightplanner.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {

    Airport findByAirportCode(String airportCode);
}
