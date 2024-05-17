package Sorting.MergeSort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackjoonOnlineJudge2751 {
	
	private static int[] arr;
	private static int[] tmp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		tmp = new int[n];
		
		for(int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());
		
		mergeSort(0, n);
		
		for(int i=0; i<n; i++) {
			bw.write(Integer.toString(arr[i]));
			
			if(i != n-1) bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void mergeSort(int start, int end) {
		if(end - start == 1) return;
		
		int mid = (start + end) / 2;
		
		mergeSort(start, mid);
		mergeSort(mid, end);
		merge(start, end);
	}
	
	public static void merge(int start, int end) {
		int mid = (start + end) / 2;
		
		int a = start;
		int b = mid;

		for(int i=start; i<end; i++) {
			if(a == mid) tmp[i] = arr[b++];
			else if(b == end) tmp[i] = arr[a++];
			else if(arr[a] >= arr[b]) tmp[i] = arr[b++]; 
			else if(arr[a] <= arr[b]) tmp[i] = arr[a++]; 
		}
		
		for(int i=start; i<end; i++) {
			arr[i] = tmp[i];
		}
	}
	
}
