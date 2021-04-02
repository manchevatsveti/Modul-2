package demo;

import java.util.Scanner;

public class BigO_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String str1 = in.next();
		String str2 = in.next();
		
		int counter=0;
		int index = -1;
//		System.out.println(str1.contains(str2));
		
		if(str1.contains(str2)) {
			for(int i=0; i<str1.length();i++) {
					if(str1.charAt(i)==str2.charAt(0) && counter==0) {
						index =i;
						counter++;
					}
					else if(str1.charAt(i)==str2.charAt(counter) ) {
						counter++;
						}
					else if(counter!=0){
						counter=0;
						index=-2;
						i--;
					}
					if(counter==str2.length()) {
						break;
					}
			}
			System.out.println("matched at index " + index);
		}
		else {
			System.out.println("No matched chars");
		}
	}

}
