package demo;

import java.util.Arrays;
import java.util.PriorityQueue;

public class s8_4 {
	public static void main(String[] args) {
		PriorityQueue<String> q1 = new PriorityQueue<>(Arrays.asList("George" , "Jim" , "John" , "Blake" , "Kevin" , "Michael" ));
		PriorityQueue<String> q2 = new PriorityQueue<>(Arrays.asList( "George" , "Katie" , "Kevin" , "Michelle" , "Ryan" ));
		
		System.out.println("Queue 1: " + q1);
		System.out.println("Queue 2: " + q2);
		
		PriorityQueue<String> union = new PriorityQueue<>(q1);
		union.addAll(q2);
		
		PriorityQueue<String> intersection = new PriorityQueue<>(q1);
		intersection.retainAll(q2);
		
		PriorityQueue<String> difference = new PriorityQueue<>(union);
		difference.removeAll(intersection);
		
		System.out.println("Union: "+ union);
		System.out.println("Difference: "+ difference);	
		System.out.println("Intersection: "+intersection);
		
	}

}
