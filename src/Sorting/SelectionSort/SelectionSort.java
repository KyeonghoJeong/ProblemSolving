package Sorting.SelectionSort;

public class SelectionSort {
	
	private static int[] arr = {3, 2, 7, 116, 62, 235, 1, 23, 55, 77};
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) swap(i, j);
			}
		}
		
		print();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) swap(i, j);
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
