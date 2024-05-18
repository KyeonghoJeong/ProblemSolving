package Sorting.QuickSort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackjoonOnlineJudge2751 {
	
	private static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		quickSort(0, n);
		
		for(int i=0; i<n; i++) {
			bw.write(Integer.toString(arr[i]));
			
			if(i != n-1) bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void quickSort(int start, int end) {
		if(end - start <= 1) return;
		
		int pivot = arr[start];
		int left = start + 1;
		int right = end - 1;
		
		while(true) {
			while(left <= right && arr[left] <= pivot) left++;
			while(left <= right && arr[left] >= pivot) right--;
			
			if(left > right) break;
			
			swap(left, right);
		}
		
		swap(start, right);
		
		quickSort(start, right);
		quickSort(right+1, end);
	}
	
	public static void swap(int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
	
}
