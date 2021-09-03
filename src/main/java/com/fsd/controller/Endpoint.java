package com.fsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.model.Flight;
import com.fsd.service.FlightService;

@CrossOrigin(origins = "http://localhost:3000", maxAge=3600)
@RestController
@RequestMapping("/api")
public class Endpoint {
	
	@Autowired
	private FlightService flightService;
	
	@PostMapping("/flight")
	public Flight createFlight(@RequestBody Flight flight) {
		return flightService.saveOrUpdateFlight(flight);
	}
	
	@GetMapping("/flights")
	public List<Flight> getAllFlights(){
		return flightService.getAllFlights();
	}

}
