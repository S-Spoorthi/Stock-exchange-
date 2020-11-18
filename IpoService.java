package com.waleed.stock.training;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class IpoService {
	public List<Ipo> getIpoDetails(){
		return Arrays.asList(
				new Ipo(106,"abc",81532,85,8,"25/02/2020","jdnnvj")
				);
	}
	
}

