package eddu.smg;

public class r4_3 {
	public static void main(String[] args) {
	   	 System.out.println(powRecursive(2, 3));
	}
    public static int powRecursive( int x, int n ) {
    	return powRecursive(x,n,1);
//      	 if (n == 0) {
//      		 return 1;
//      	 }
//      	 
//      	 return x * powRecursive(x, n - 1 );
       }
    private static int powRecursive( int x, int n,int result ) {
    	if(n==0) {
    		return result;
    	}
    	else {
    		return powRecursive(x, n-1,result*=x);
    	}
    }
}
