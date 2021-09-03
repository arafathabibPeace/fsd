package com.fsd.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="flight")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="flightId")
	private int flightId;
	
	@Column(name="flightNumber")
	private String flightNumber;
	
	@Column(name="departurePort")
	private String departurePort;
	
	@Column(name="arrivalPort")
	private String arrivalPort;
	
	@Column(name="departureTime")
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime departureTime;
	
	@Column(name="arrivalTime")
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime arrivalTime;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDeparturePort() {
		return departurePort;
	}

	public void setDeparturePort(String departurePort) {
		this.departurePort = departurePort;
	}

	public String getArrivalPort() {
		return arrivalPort;
	}

	public void setArrivalPort(String arrivalPort) {
		this.arrivalPort = arrivalPort;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

}
