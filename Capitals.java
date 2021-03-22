package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Capitals {
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);

		Map<String, String> countriesAndCapitals = getData();
		
		int score=0;
		for(String country : countriesAndCapitals.keySet()) {
				System.out.print("Which is the capital of " + country+ " \n");
		
			String capital = input.nextLine();
			
		if (countriesAndCapitals.get(country).equals(capital)) {
			System.out.println("Correct");
			score++;
			System.out.println("Score: "+ score);
		}
		else {
			System.out.println("Incorrect");
			System.out.println("Correct answer: "+ countriesAndCapitals.get(country));
			score--;
			System.out.println("Score: "+ score);
		}
	  }
	}

	public static Map<String, String> getData() {
		Map<String, String> map = new HashMap<>();
		String[][] data = {
			{"Netherlands", "Amsterdam"}, {"Andorra", "Andorra"}, {"Greece", "Athens"},
			{"Serbia", "Belgrade"}, {"Germany", "Berlin"},
			{"Switzerland", "Bern"}, {"Slovakia", "Bratislava"}, 
			{"Belgium", "Brussels"}, {"Romania", "Bucharest"}, 
			{"Hungary", "Budapest"},{"Hungary", "Chisinau"}, {"Denmark", "Copenhagen"},
			{"Ireland", "Dublin"}, {"Finland", "Helsinki"},
			{"Ukraine", "Kiev"}, {"Portugal", "Lisbon"}, {"Slovenia","Ljubljana"}, 
			{"United Kingdom", "London"}, {"Luxembourg", "Luxembourg"}, 
			{"Spain", "Madrid"}, {"Belarus", "Minsk"}, 
			{"Monaco", "Monaco"}, {"Russia", "Moscow"}, 
			{"Greenland", "Nuuk"}, {"Norwy", "Oslo"}, 
			{"France", "Paris"}, {"Italy", "Rome"}, 
			{"Bulgaria", "Sofia"}, {"Sweden", "Stockholm"}, 
			{"Malta", "Valetta"}, {"Austria", "Vienna"}, 
			{"Croatia", "Zagreb"}};

		for (int i = 0; i < data.length; i++) {
			map.put(data[i][0], data[i][1]);
		}

		return map;
	}
}
