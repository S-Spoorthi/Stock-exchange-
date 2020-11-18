package com.waleed.stock.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stocks")
public class StockController {
	
	@Autowired
	StockService theService;
	
	@RequestMapping("/")
	List<Stock> getStocks(){
		return theService.getStocks();
	}
}