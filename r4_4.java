package eddu.smg;

import java.util.Scanner;

public class r4_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Num count: ");
		int n = in.nextInt();
		int[] intArray = new int[n];
		for(int i=0;i<n;i++) {
			intArray[i] = in.nextInt();
		}
		System.out.println(average(intArray));
	}
	public static int average(int []args) {
		return average(args,args.length,0);
	}
	private static int average(int []args, int n, int average) {
		if(n==0) {
			return average/args.length;
		}
		else {
			return average(args, n-1, average+=args[n-1]);
		}
	}

}
