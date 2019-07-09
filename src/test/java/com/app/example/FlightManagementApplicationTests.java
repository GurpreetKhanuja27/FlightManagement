package com.app.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.app.bean.Flight;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightManagementApplicationTests {

	@Test
	public void testHiService() {
			
			RestTemplate template = new RestTemplate();
			ResponseEntity<String> output  = template.exchange(
											 "http://localhost:8080/controller/hi",HttpMethod.GET,null,String.class);
			
			assertEquals("Hi",output.getBody());		
	}
	
	@Test
	public void testGetFlightById() {
		
		
		RestTemplate template = new RestTemplate();
		ResponseEntity<Flight> flight = template.exchange("http://localhost:8080/controller/1",
						  HttpMethod.GET, null, Flight.class);
		System.out.println(flight.getBody().getFname());
		assertEquals("Delta",flight.getBody().getFname());
		assertEquals(200,flight.getBody().getNumberofseats());
		assertEquals("Very Good", flight.getBody().getDescription());
		
		
	}
	
	
	
	
	
	
	

}
