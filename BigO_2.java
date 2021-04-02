package demo;

import java.util.LinkedList;
import java.util.Scanner;

public class BigO_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	
	String str1 = in.next();
	
	LinkedList<Character> max = new LinkedList<>();
	
	for(int i=0;i<str1.length();i++) {
		LinkedList<Character> list = new LinkedList<>();
		list.add(str1.charAt(i));
		for(int j=i+1;j<str1.length();j++) {
			if(str1.charAt(j)>list.getLast()) {
				list.add(str1.charAt(j));
			}
		}
		if(list.size()> max.size()) {
			max.clear();
			max.addAll(list);
		}
	}
	System.out.println(max.toString());
	
  }
}
