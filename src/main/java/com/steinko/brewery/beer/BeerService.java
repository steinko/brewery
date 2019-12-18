package com.steinko.brewery.beer;

import java.util.UUID;

public class BeerService {
	BeerDto findBeerById(UUID Id) {
		return new BeerDto(null, null, null, null, null, null, Id, null, null);
	}

}
