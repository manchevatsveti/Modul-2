package ae;

public class s14_2 {
	public static String formatHeader = "%-12s%-10s%-10s%-10s%-10s%n";
	public static String formatTimeData = "%,-12d%-10d%-10d%-10d%-10d%n";
	
	public static void main(String[] args) {
		System.out.printf(formatHeader, "Array size", "Bubble", "Selection", "Merge", "Qiuck");
		 sorting(10000);
		 sorting(50000);
		 sorting(100000);
		 sorting(150000);
		 sorting(200000);
		 sorting(250000);
	}
	
	public static void sorting(int n) {
		int[] arrB = new int[n];
		int[] arrS = new int[n];
		int[] arrM = new int[n];
		int[] arrQ = new int[n];
		for (int i = 0;i < n; i++) {
			int element = (int) (Math.random() * 1000);
			 arrB[i] = element;
			 arrS[i] = element;
			 arrM[i] = element;
			 arrQ[i] = element;
		}
		
		long timeB = 0, timeS =0, timeM =0, timeQ =0;
		
		long currentTime = System.currentTimeMillis();
		BubbleSort.bubbleSort(arrB);
		timeB = System.currentTimeMillis() - currentTime;
		
		currentTime = System.currentTimeMillis();
		SelectionSort.selectionSort(arrS);;
		timeS = System.currentTimeMillis() - currentTime;
		
		currentTime = System.currentTimeMillis();
		MergeSort.mergeSort(arrM);
		timeM = System.currentTimeMillis() - currentTime;
		
		currentTime = System.currentTimeMillis();
		QuickSort.quickSort(arrQ);
		timeQ = System.currentTimeMillis() - currentTime;
		
		System.out.printf(formatTimeData, n, timeB, timeS, timeM, timeQ);
	}
}
