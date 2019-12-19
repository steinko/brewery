package com.steinko.brewery.order;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.elasticsearch.test.ESTestCase;

public class BeerOrderServiceTest  extends ESTestCase {
	
	private BeerOrderService service;

    @BeforeEach
    public void init() {
    	service = new BeerOrderService();
    }
	
	@Test
	void shouldExist()  { 
		assertNotNull(service);
	}
	
	@Test
	void shouldReturnJson()  { 
		assertNotNull(service.listOrders(null,null));
	}
}

