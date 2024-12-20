package com;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Main {

	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);

		try {
			 System.out.print("Enter the input file path: ");
	            String inputFilePath = scanner.nextLine();

	            System.out.print("Enter the stock words file path: ");
	            String stockWordsFilePath = scanner.nextLine();

	            System.out.print("Enter the output file path: ");
	            String outputFilePath = scanner.nextLine();
			
			
			StockWordLoader swl = new StockWordLoader();
			Set<String> stockWords =swl.loadStockWord(stockWordsFilePath);
					
			
			wordProcessor wp = new wordProcessor(stockWords);
			Map<String,Integer> wordCounter =  wp.processFile(inputFilePath);
			
			fileWriter fw = new fileWriter();
			fw.writeCounterToFile(wordCounter, outputFilePath);
			
			System.out.println("Output File Created : " + outputFilePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			scanner.close();		}
		
		
	}
	
}

// "E:\javaWS\Word Counter\stockWords"
//"E:\javaWS\Word Counter\input"
//"E:\javaWS\Word Counter\stockWords"
//"E:\javaWS\Word Counter\output.txt"