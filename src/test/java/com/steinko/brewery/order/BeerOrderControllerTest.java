package com.steinko.brewery.order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.steinko.brewery.beer.BeerController;
import com.steinko.brewery.beer.BeerDto;
import com.steinko.brewery.beer.BeerPagedList;
import com.steinko.brewery.beer.BeerService;
import com.steinko.brewery.beer.BeerStyleEnum;
import org.elasticsearch.test.ESTestCase;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(BeerOrderControllerTest.class)

class BeerOrderControllerTest  extends ESTestCase {

    @MockBean
    BeerOrderService service;
    
    @Autowired
    MockMvc mockMvc;

    BeerOrderPagedList list;

    @BeforeEach
    public void init() {
    	List<BeerOrderDto> beerList = new ArrayList<BeerOrderDto>();
		beerList.add(new BeerOrderDto());
		beerList.add(new BeerOrderDto() );
		list =  new BeerOrderPagedList(beerList);
        
    }

    @Test
    public void testGetBeerById() throws Exception {
    	UUID id = new UUID(1L,1L);
        given(service.listOrders(id, any())).willReturn(list);

        mockMvc.perform(get("/api/v1/customers/" + id + "/orders"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
                

    }
    
   // @AfterEach
    //public void teardown()  {  
   // 	reset(beerService);
    //}
}