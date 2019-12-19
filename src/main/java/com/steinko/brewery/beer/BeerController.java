package com.steinko.brewery.beer;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.springframework.beans.factory.annotation.Autowired;

@RequestMapping(value = "api/v1/beer/")
@RestController
public class BeerController {
	
	Logger logger = LogManager.getLogger(BeerController.class);
	
	BeerService service;
	
	@Autowired
	BeerController( BeerService service)
	{ 
		this.service = service;
	}
	
	@GetMapping(path = { "/{beerId}/"}, produces = { "application/json"})
	 public BeerDto   getBeer(UUID id){ 
		logger.info(service);
		return service.findBeerById(id);
		
	}

}
