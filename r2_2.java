package eddu.smg;

import java.util.Scanner;

public class r2_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("X = ?");
		int x = in.nextInt();
		System.out.println(dec2Bin(x));
	}
	
	public static String dec2Bin(int value) {
		String bin = "";
		return dec2Bin(value, bin);
	}
	
	public static String dec2Bin(int value, String bin) {
		if (value / 2 == 0) {
			return (value % 2) + bin;}
		else {
			return dec2Bin(value / 2, (value % 2) + bin); 
		}
	}
}

