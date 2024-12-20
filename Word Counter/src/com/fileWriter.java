package com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Map;

class fileWriter {

	public void writeCounterToFile(Map<String,Integer> wordCount, String filePath ) throws Exception {
		FileWriter f =new FileWriter(filePath);
		try (BufferedWriter writer = new BufferedWriter(f)) {
			for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
				writer.write(entry.getKey()+":"+entry.getValue());
				writer.newLine();
				
			}
		}
		
		
		
	}
	
}
