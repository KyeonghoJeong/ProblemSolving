package Sorting.BubbleSort;

public class BubbleSort {
	
	private static int[] arr = {3, 2, 7, 116, 62, 235, 1, 23, 55, 77};
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) swap(j, j+1);
			}
		}
		
		print();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] < arr[j+1]) swap(j, j+1);
			}
		}
		
		print();
	}
	
	public static void swap(int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	
	public static void print() {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			
			if(i != arr.length-1) System.out.print(" ");
		}
		
		System.out.println();
	}

}
