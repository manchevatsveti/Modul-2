package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountVocals {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("src/demo/words.txt");
		if (file.exists()) {
			System.out.println("The number of vocals is " + countVocals(file));
		} else {
			System.out.println("File does not exist");
		}

	}
	public static int countVocals(File file) throws Exception {
		
		Scanner input = new Scanner(file);
	
		Set<Character> set = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
		int count = 0;
		
		while (input.hasNext()) {
			String line = input.nextLine();
			for (int i = 0; i < line.length(); i++) {
				char letter = Character.toUpperCase(line.charAt(i));
				if (set.contains(letter)) {
					count++;
				}
			}
		}
		return count;

	}

}
