package com.example.esAPI_CustomQuery.services;

import com.example.esAPI_CustomQuery.entities.Flight;
import com.example.esAPI_CustomQuery.enums.StatusFlight;
import com.example.esAPI_CustomQuery.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    private String randomString(){
        Random random = new Random();
        IntStream ints = random.ints(3);
        int[] arrInt = ints.toArray();
        String randomString = "";
        for (int i : arrInt){
            randomString = randomString + i;
        }
        return randomString;
    }

    public List<Flight> createRandoms(Integer number) {
        List<Flight> flights = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Flight flight = new Flight();
            flight.setStatus(StatusFlight.ONTIME);
            flight.setDescription(randomString());
            flight.setFromAirport(randomString());
            flight.setToAirport(randomString());

            flights.add(flight);
        }
        List<Flight> responseFlights = flightRepository.saveAll(flights);
        return responseFlights;
    }

    public List<Flight> readAll() {
        List<Flight> flights = flightRepository.findAll();
        return flights;
    }
}
