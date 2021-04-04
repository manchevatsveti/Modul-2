package demo;

import java.util.ArrayList;
import java.util.HashSet;

public class interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1, 2, 3, 9};
		int[] arr2 = {7, 2, 4, 4};
		int[] arr3 = {1, 2, 4, 4};
		int sum =8;
		
		System.out.println("Method 1: ");
		System.out.println(method1(arr1, sum));
		System.out.println(method1(arr2, sum));
		System.out.println();
		
		System.out.println("Method 2: ");
		System.out.println(method2(arr1, sum));
		System.out.println(method2(arr2, sum));
		System.out.println();
		
		System.out.println("Method 3: ");
		System.out.println(method3(arr1, sum));
		System.out.println(method3(arr3, sum));
		System.out.println();
		
		System.out.println("Method 4: ");
		System.out.println(method4(arr1, sum));
		System.out.println(method4(arr2, sum));
		System.out.println();
		
	}
	
	public static boolean method1(int[] arr,int sum){
		boolean m = false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					m= true;
					break;
				}
			}
		}
		return m;
	}
public static boolean method2(int[] arr,int sum){
	boolean m = false;
	for(int i=0;i<arr.length;i++) {
		int target = sum-arr[i];
		
		int low=0;
		int high = arr.length-1;
		
		while(low<high) {
			int mid = (low+high)/2;
			if(target<arr[mid]) {
				high = mid-1;
			}
			else if(target==arr[mid]) {
				m =true;
				break;
			}
			else {
				low=mid+1;
			}
		}
		if(m==true) {
			break;
		}
	}
	return m;
}
public static boolean method3(int[] arr,int sum){
	boolean m=false;
	
	int low=0;
	int high=arr.length-1;
	
	while(low<high) {
		int temp = arr[low]+arr[high]; 
		
		if(temp>sum) {
			high--;
		}
		else if(temp<sum) {
			low++;
		}
		else if(temp==sum) {
			m=true;
			break;
		}
	}
	return m;
}
public static boolean method4(int[] arr,int sum){
	boolean m=false;
	HashSet<Integer> comp=new HashSet<Integer>();  
	
	for(int value : arr) {
		if(comp.contains(value)) {
			m=true;
		}
		else {
			comp.add(sum-value);
			}
		}
	return m;
	}

}
