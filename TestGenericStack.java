package eddu.smg;

import java.util.Scanner;

public class TestGenericStack {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        GenericStack1<String> stack = new GenericStack1<>();
        for (int i = 1; i < 6; i++) {
        	System.out.println("Add element "+ i);
            stack.push(in.next());
        }
        System.out.println("In reverse: ");
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    
		
		GenericStack<String> stack1 = new GenericStack<>();
		for(int i=1; i<6;i++) {
			System.out.println("Add element "+ i);
			stack1.push(in.next());
		}
		System.out.println(stack1.peek());
		System.out.println(stack1.pop());
		System.out.println(stack1.peek());
		
		
//		GenericStack<Integer> stack2 = new GenericStack<>();
//		stack2.push(1); // autoboxing 1 to new Integer(1)
//		stack2.push(2);
//		stack2.push(3);
	}
	
//	stack1.push("Berlin");
}
