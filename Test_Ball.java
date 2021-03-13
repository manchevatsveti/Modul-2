package demo;

import java.util.LinkedList;

public class Test_Ball {
	public static void main(String[] args) {
		LinkedList<Integer> num= new LinkedList<>();
		for(int i=0;i<5_000_000;i++) {
			num.add(i);
		}
		int temp =0;
		for(Integer number: num) {
			temp=number;
		}

		System.out.print(temp);
	}
	

}
