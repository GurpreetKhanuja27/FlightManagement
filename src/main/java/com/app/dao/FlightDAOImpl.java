package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.app.bean.Flight;

@Repository
@Transactional
public class FlightDAOImpl implements FlightDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void addFlight(Flight f) {
		em.persist(f);
		
	}

	@Override
	public List<Flight> getAllFlights() {
	
		String query = "from Flight"; //HQL
		List<Flight> flights = em.createQuery(query).getResultList();
		return flights;
	}

	@Override
	public Flight getFlightById(int id) {
		Flight f = em.find(Flight.class, id);
		return f;
	}

}
