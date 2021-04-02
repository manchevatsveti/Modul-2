package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class s8_2 {
	public static void main(String[] args) {
		Stack<Character> braces = new Stack<>();
		File myObj = new File("src/demo/Ball.java");
		FileReader rd;
		
		try {
			rd = new FileReader(myObj);
			BufferedReader br = new BufferedReader(rd);
			int c = 0;
			boolean conflict = false;
			while ((c = br.read()) != -1)
			{
				char character = (char) c;
				if(character == '{' || character == '[' || character == '(' ) {
					braces.add(character);
				} else if(character == '}') {
					conflict = braces.pop() != '{';
				}
				else if(character == ']') {
					conflict = braces.pop() != '[';
				}
				else if(character == ')') {
					conflict = braces.pop() != '(';
				}
				
				if(conflict) {
					break;
				}
			}
			
			if(conflict || !braces.isEmpty()) {
				System.out.println("Error, braces are not correctly matched");
			}else {
				System.out.println("Correctly matched braces");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
