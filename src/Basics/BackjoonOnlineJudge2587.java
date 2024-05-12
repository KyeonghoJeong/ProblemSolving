package Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BackjoonOnlineJudge2587 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) arr[i] = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<5; i++) sum += arr[i];
		avg = sum / 5;
		
		Arrays.sort(arr);
		
		bw.write(Integer.toString(avg)+"\n");
		bw.write(Integer.toString(arr[2]));
		
		bw.flush();
		bw.close();
		br.close();
	}

}