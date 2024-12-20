package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

class StockWordLoader {

	public Set<String> loadStockWord(String filePath) throws Exception {
		
		Set<String> stockword = new HashSet<>();
		
		FileReader f = new FileReader(filePath);
		try (BufferedReader read = new BufferedReader(f)) {
			String line  ;
			while( (line = read.readLine()) != null) {
				stockword.add(line.trim().toLowerCase());
				
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return stockword;
	}
	
	
}
