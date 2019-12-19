package com.steinko.brewery.order;

import java.util.UUID;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BeerOrderService {
	public BeerOrderPagedList listOrders(UUID customerId, Pageable pageable)  { 
		return new BeerOrderPagedList(null);
	}

}
