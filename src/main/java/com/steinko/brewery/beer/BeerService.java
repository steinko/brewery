package com.steinko.brewery.beer;

import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class BeerService {
	BeerDto findBeerById(UUID id) {
		return new BeerDto(id, null, null, null, null, null, null, null, null);
	}

}
