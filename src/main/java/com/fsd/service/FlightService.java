package com.fsd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd.model.Flight;
import com.fsd.repository.FlightRepository;

@Service
public class FlightService {

	@Autowired
	private FlightRepository flightRepository;
	
	public Flight saveOrUpdateFlight(Flight flight) {
		return flightRepository.save(flight);
		
	}
	
	public List<Flight> getAllFlights(){
		List<Flight> flightList = new ArrayList<Flight>();
		flightRepository.findAll().forEach(flight-> flightList.add(flight));
		return flightList;
	}
}
