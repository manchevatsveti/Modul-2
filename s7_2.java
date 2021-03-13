package eddu.smg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class s7_2 {  
  public static void main(String[] args) { 
	  ArrayList<String> words = new ArrayList<>();
	  
		File myObj = new File("words.txt");
		try {
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String text = myReader.nextLine();
				String lineWords[] = text.split("[\\s.,]+");
				words.addAll(Arrays.asList(lineWords));
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			try {
				myObj.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		Collections.sort(words);
		System.out.println(words);
  }
	
}