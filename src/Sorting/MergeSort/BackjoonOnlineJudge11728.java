package Sorting.MergeSort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BackjoonOnlineJudge11728 {
	
	private static int[] a;
	private static int[] b;
	private static int[] result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		a = new int[n];
		b = new int[m];
		result = new int[n+m];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<m; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		mergeSort();
		
		for(int i=0; i<n+m; i++) {
			bw.write(Integer.toString(result[i]));
			
			if(i != n+m-1) bw.write(" ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void mergeSort() {
		int idx1 = 0;
		int idx2 = 0;
		
		for(int i=0; i<result.length; i++) {
			if(idx1 == a.length) result[i] = b[idx2++];
			else if(idx2 == b.length) result[i] = a[idx1++];
			else if(a[idx1] <= b[idx2]) result[i] = a[idx1++];
			else if(a[idx1] >= b[idx2]) result[i] = b[idx2++];
		}
	}

}
