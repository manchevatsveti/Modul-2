package eddu.smg;

public class r_1 {
	public static void main(String[] args) {
		System.out.println("Sum is " + sum(5));
	}
	public static int sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
//	public static void main(String[] args) {
//	   	 System.out.println("Sum is " + xMethod(5));
//	}
//
//	public static int xMethod(int n) {
//	   	 if (n == 1)
//	   		 return 1;
//	   	 else
//	   		 return n + xMethod(n - 1);
//	}
	

}
