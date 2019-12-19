package com.steinko.brewery.beer;


import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeerPagedListTest {
	@Test
	public void shouldExist() {
		List<BeerDto> beerList = new ArrayList<BeerDto>();
		beerList.add(new BeerDto(null, null, null,null,null,
                null, null, null, null ));
		beerList.add(new BeerDto(null, null, null,null,null,
                null, null, null, null ) );
		BeerPagedList list =  new BeerPagedList(beerList);
		assertEquals(list.getSize(), 0);
	}

}
