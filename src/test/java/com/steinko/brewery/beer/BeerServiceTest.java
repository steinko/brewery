package com.steinko.brewery.beer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BeerServiceTest {
	@Test
	void shouldExist() {
		BeerService service = new BeerService();
		assertNotNull(service);
	}

}
