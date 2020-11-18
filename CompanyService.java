package com.waleed.stock.training;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CompanyService {
	public List<Company> getCompanyDetails(){
		return Arrays.asList(
				new Company(156, "keys", 166666, "uu", "was", "y", "govt","edtghui", 31)
				);
	}
}
