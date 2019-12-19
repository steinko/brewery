package com.steinko.brewery.beer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.elasticsearch.test.ESIntegTestCase;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BeerControllerIntegTest extends ESIntegTestCase{
	
	
	@Autowired
	TestRestTemplate template;
	
	@Test
	void shouldReturnListOfBeers() {
		BeerPagedList beerList = template.getForObject("/api/v1/beer/",BeerPagedList.class);
		assertEquals(beerList.getContent().size(), 2);
	}

}


