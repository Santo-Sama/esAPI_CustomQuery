package com.example.esAPI_CustomQuery.controller;

import com.example.esAPI_CustomQuery.entities.Flight;
import com.example.esAPI_CustomQuery.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/randoms")
    public ResponseEntity<List<Flight>> createRandoms(@RequestParam Integer numberOfRandoms) {
        List<Flight> responseFlights = flightService.createRandoms(numberOfRandoms);
        return ResponseEntity.ok().body(responseFlights);
    }

    @GetMapping("/read")
    public ResponseEntity<List<Flight>> readAll() {
        List<Flight> responseFlights = flightService.readAll();
        return ResponseEntity.ok().body(responseFlights);
    }
}
