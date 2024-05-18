package Sorting.CountingSort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackjoonOnlineJudge15688 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int[] freq = new int[2000001];
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			freq[num + 1000000]++;
		}
		
		int idx = 0;
		
		for(int i=0; i<2000001; i++) {
			while(freq[i]-- > 0) {
				arr[idx++] = i - 1000000;
			}
		}
		
		for(int i=0; i<n; i++) {
			bw.write(Integer.toString(arr[i]));
			
			if(i != n-1) bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}