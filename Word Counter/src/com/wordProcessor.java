package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


class wordProcessor {

	public Set<String> stockword;

	wordProcessor(Set<String> stockword) {
		this.stockword = stockword;

	}

	public Map<String, Integer> processFile(String filePath) throws Exception{

		Map<String,Integer> map = new LinkedHashMap<>();

		FileReader f = new FileReader(filePath);
		try (BufferedReader read = new BufferedReader(f)) {
			String line ;

			while((line = read.readLine()) != null) {

				String[] words = line.toLowerCase().split("\\W+");


				for(String word : words) {
					if(word.isEmpty() || stockword.contains(word)) {
						
						continue;

					}
					map.put(word, map.getOrDefault(word, 0)+1);
				}

			}
		} catch (Exception e) {
			 System.err.println("Error while processing input file: " + filePath);
			e.printStackTrace();
		}

		return map;

	}	

}
