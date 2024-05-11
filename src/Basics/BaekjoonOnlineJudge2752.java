package Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekjoonOnlineJudge2752 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[3];
		
		for(int i=0; i<3; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<3; i++) {
			for(int j=i+1; j<3; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<3; i++) {
			bw.write(Integer.toString(arr[i]));
			
			if(i < 2) bw.write(" ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}