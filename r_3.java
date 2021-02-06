package eddu.smg;

public class r_3 {
	public static void main(String[] args) {
		System.out.println(r_method(5));
		System.out.println(i_method(10));
	}
	public static int r_method(int n) {
		if(n==1) {
			return 2;
		}
		else {
			return 2 * r_method(n-1);
		}
		
	}
	public static int i_method(int n) {
		int total=1;
		for(int i=1;i<=n;i++) {
			total*=2;
		}
		return total;
	}
}
