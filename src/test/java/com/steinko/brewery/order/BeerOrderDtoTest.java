package com.steinko.brewery.order;


import org.junit.jupiter.api.Test;
import org.elasticsearch.test.ESTestCase;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BeerOrderDtoTest  extends ESTestCase {
	
	
	
	@Test
	void shoulExist()  { 
		
		assertNotNull(new BeerOrderDto());
	}

}

