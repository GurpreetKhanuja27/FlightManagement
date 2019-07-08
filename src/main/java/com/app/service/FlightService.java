package com.app.service;

import java.util.List;

import com.app.bean.Flight;

public interface FlightService {

	public void addFlight(Flight f);
	public List<Flight> getAllFlights();
	public Flight getFlightById(int id);
	public void editFlightById(int id, Flight flight);
}
