package com.steinko.brewery.beer;
import java.util.UUID;

@RestController
public class BeerController {
	
	BeerService service;
	
	BeerController( BeerService service)
	{ 
		this.service = service;
	}
	
	@Get("api/v1/beer/")
	 public BeerDto   getBeer(UIDD id){ 
		return service.findBeerById(id);
		
	}

}
