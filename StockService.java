package com.waleed.stock.training;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StockService {
	public List<Stock> getStocks(){
		return Arrays.asList(
				new Stock(5,6525,"fgyu","hufdhu","texfg")
				);
	}
	
}
