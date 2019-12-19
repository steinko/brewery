package com.steinko.brewery.beer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.elasticsearch.test.ESTestCase;

import java.util.UUID;

public class BeerServiceTest extends ESTestCase {
	
	@Autowired
	private BeerService service;
	
	
	@Test
	public void shouldExist() {
		assertNotNull(service);
	}
	
	@Test 
	public void shoudReturnDTO() {
		UUID id = new UUID(1L,1L);
		BeerDto dto = service.findBeerById(id);
		assertNotNull(dto);
		
	}

}
