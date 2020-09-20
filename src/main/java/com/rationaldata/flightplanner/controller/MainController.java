package com.rationaldata.flightplanner.controller;


import com.rationaldata.flightplanner.model.Airport;
import com.rationaldata.flightplanner.model.Flight;
import com.rationaldata.flightplanner.services.AirportService;
import com.rationaldata.flightplanner.services.FlightService;
import com.rationaldata.flightplanner.util.FlightPlan;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.websocket.server.PathParam;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;


@Controller
public class MainController {

    @Autowired
    AirportService airportService;

    @Autowired
    FlightService flightService;

    @GetMapping("/flights")
    @ResponseBody
    public List<FlightPlan> searchFlight(@RequestParam(required = false) String airportCode) {
        List<Flight> flights = new ArrayList<Flight>();
        if (airportCode != null) {
            Airport originAirport = airportService.getAirportByAirportCode(airportCode);
            flights = flightService.getAllFlightsByOriginAirport(originAirport);
        } else {
            flights = flightService.getAllFlights();
        }
        List<FlightPlan> flightPlans = new ArrayList<>();

        for (Flight flight : flights) {
            FlightPlan flightPlan = new FlightPlan();
            flightPlan.setOrigin(flight.getOriginAirport().getAirportCode());
            flightPlan.setDestination(flight.getDestinationAirport().getAirportCode());
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime departureLocalDateTime = LocalDateTime.parse(flight.getDeparture(), dtf);
            Date departureDate = java.util.Date
                    .from(departureLocalDateTime.atZone(ZoneId.systemDefault())
                            .toInstant());
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
            formatter.setTimeZone(TimeZone.getTimeZone("Europe/Athens"));
            flightPlan.setDeparture(formatter.format(departureDate));
            LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(flight.getDeparture(), dtf);
            Date arrivalDate = java.util.Date
                    .from(arrivalLocalDateTime.atZone(ZoneId.systemDefault())
                            .toInstant());
            flightPlan.setArrival(formatter.format(arrivalDate));
            flightPlan.setAircraft(flight.getAircraft().getAircraftName());
            flightPlans.add(flightPlan);

        }
        return flightPlans;
    }

}
