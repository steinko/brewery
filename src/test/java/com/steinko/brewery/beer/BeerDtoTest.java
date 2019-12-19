package com.steinko.brewery.beer;

import org.junit.jupiter.api.Test;
import org.elasticsearch.test.ESTestCase;

public class BeerDtoTest  extends ESTestCase {
	
	@Test
	void shouldReturnJson()  { 
		
		BeerDto beerDto = new BeerDto(null, null, null, null, null, null, null, null, null);
	}

}
