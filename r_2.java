package eddu.smg;

public class r_2 {
	public static void main(String[] args) {
		reverse(1234567);
	}
	
	public static void reverse(int n) {
		int newNum=0;
		while(n!=0) {
			newNum=newNum*10+n%10;
			n/=10;
		}
		 System.out.print(newNum);
		
	}
//	public static void main(String[] args) {
//	   	 xMethod(1234567);
//	}
//
//	public static void xMethod(int n) {
//	   	 if (n > 0) {
//	   		 System.out.print(n % 10);
//	   		 xMethod(n / 10);
//	   	 }
//	 }

}
