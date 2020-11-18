package com.waleed.stock.training;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SectorService {
	public List<Sector> getAllSectors(){
		return Arrays.asList(
				new Sector(5,"govt","hufdhu")
				);
	}
	
}
