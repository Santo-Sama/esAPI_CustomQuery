package com.example.esAPI_CustomQuery.repositories;

import com.example.esAPI_CustomQuery.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}
