package Sorting.MergeSort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BackjoonOnlineJudge11728 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] a = new int[n];
		int[] b = new int[m];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) b[i] = Integer.parseInt(st.nextToken());
		
		int[] c = merge(a, b);
		
		for(int i=0; i<c.length; i++) {
			bw.write(Integer.toString(c[i]));
			
			if(i != c.length-1) bw.write(" ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		
		int idx1 = 0;
		int idx2 = 0;
		
		for(int i=0; i<c.length; i++) {
			if(idx1 == a.length) c[i] = b[idx2++];
			else if(idx2 == b.length) c[i] = a[idx1++];
			else if(a[idx1] >= b[idx2]) c[i] = b[idx2++];
			else if(a[idx1] <= b[idx2]) c[i] = a[idx1++];
		}
		
		return c;
	}

}
