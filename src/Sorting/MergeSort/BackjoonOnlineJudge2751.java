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
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
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
		
		int idx1 = start;
		int idx2 = mid;
		
		for(int i=start; i<end; i++) {
			if(idx1 == mid) tmp[i] = arr[idx2++];
			else if(idx2 == end) tmp[i] = arr[idx1++];
			else if(arr[idx1] >= arr[idx2]) tmp[i] = arr[idx2++];
			else if(arr[idx1] <= arr[idx2]) tmp[i] = arr[idx1++];
		}
		
		for(int i=start; i<end; i++) arr[i] = tmp[i];
	}
	
}
