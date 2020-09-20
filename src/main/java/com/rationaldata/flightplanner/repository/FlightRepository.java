package com.rationaldata.flightplanner.repository;

import com.rationaldata.flightplanner.model.Airport;
import com.rationaldata.flightplanner.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findAllByOriginAirportEquals(Airport depAirport);

}
