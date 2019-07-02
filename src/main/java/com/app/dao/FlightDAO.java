package com.app.dao;

import java.util.List;

import com.app.bean.Flight;

public interface FlightDAO {

	public void addFlight(Flight f);
	public List<Flight> getAllFlights();
	public Flight getFlightById(int id);
}
