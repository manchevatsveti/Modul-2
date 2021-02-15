package eddu.smg;

public class r4_1 {
	public static void main(String[] args) {
		System.out.println(foo(54,81));
	}
    public static int foo (int x, int y)
    {
   	if (y == 0)
     	    return x;
   	else
     	    return foo(y, x % y);
    }

}
