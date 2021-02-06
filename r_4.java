package eddu.smg;

import java.util.Scanner;

public class r_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("X = ?");
		int x = in.nextInt();
		System.out.println("n = ?");
		int n = in.nextInt();
		
		System.out.println(r_method(n,x));
		System.out.println(i_method(n,x));
	}
	public static int r_method(int n,int x) {
		if(n==1) {
			return x;
		}
		else {
			return x * r_method(n-1,x);
		}
		
	}
	public static int i_method(int n,int x) {
		int total=1;
		for(int i=1;i<=n;i++) {
			total*=x;
		}
		return total;
	}
}
