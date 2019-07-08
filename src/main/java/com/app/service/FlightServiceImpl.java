package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bean.Flight;
import com.app.dao.FlightDAO;

@Service
public class FlightServiceImpl implements FlightService{

	@Autowired
	FlightDAO dao;
	
	@Override
	public void addFlight(Flight f) {
		 dao.addFlight(f);
	}

	@Override
	public List<Flight> getAllFlights() {
		
		List<Flight> flights = dao.getAllFlights();
		return flights;
	}

	@Override
	public Flight getFlightById(int id) {
		Flight f = dao.getFlightById(id);
		return f;
	}

	@Override
	public void editFlightById(int id, Flight flight) {
		dao.editFlightById(id, flight);
		
	}

	@Override
	public void deleteFlightById(int id) {
		
		dao.deleteFlightById(id);
		
	}

}
