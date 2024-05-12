package Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BackjoonOnlineJudge2309 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[9];
		int[] result = new int[7];
		
		for(int i=0; i<9; i++) arr[i] = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		for(int i=0; i<9; i++) sum += arr[i];
		
		int diff = sum - 100;
		int idx1 = 0;
		int idx2 = 0;
		
		for(int i=0; i<9; i++) {
			idx1 = i;
			
			for(int j=i+1; j<9; j++) {
				if(arr[i] + arr[j] == diff) {
					idx2 = j;
					break;
				}
			}
			
			if(idx2 != 0) break;
		}
		
		int idx3 = 0; // arr
		int idx4 = 0; // result
		
		while(idx3 < 9) {
			if(idx3 != idx1 && idx3 != idx2) result[idx4++] = arr[idx3];
			
			idx3++;
		}
		
		Arrays.sort(result);
		
		for(int i=0; i<7; i++) {
			bw.write(Integer.toString(result[i]));
			
			if(i < 6) bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
