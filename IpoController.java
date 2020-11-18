package com.waleed.stock.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ipodetails")
public class IpoController {
	
	@Autowired
	IpoService theService;
	
	@RequestMapping("/")
	List<Ipo> getIpoDetails(){
		return theService.getIpoDetails();
	}
}
