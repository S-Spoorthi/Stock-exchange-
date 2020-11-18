package com.waleed.stock.training;
import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("Company")
public class CompanyController {
	@Autowired
	CompanyService theCservice;
	
	@RequestMapping("/all")
	List<Company> getCompanyDetails(){
		return theCservice.getCompanyDetails();
	
	}
}
