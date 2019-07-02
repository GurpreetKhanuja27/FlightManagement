package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.bean.Flight;
import com.app.service.FlightService;

@RestController
@RequestMapping(value = "/controller")
public class FlightController {

	@Autowired
	FlightService service;

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi() {
		return "Hi";
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public String addFlight(@RequestBody Flight f) {

		service.addFlight(f);

		return "1 flight added";
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE})
	public List<Flight> getAllFlight() {

		List<Flight> flights = service.getAllFlights();

		return flights;
	
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE})
	public Flight getFlightById(@PathVariable int id) {

		Flight flight = service.getFlightById(id);

		return flight;
	}
}