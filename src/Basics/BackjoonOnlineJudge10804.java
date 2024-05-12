package Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BackjoonOnlineJudge10804 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[21];
		
		for(int i=1; i<21; i++) arr[i] = i;

		for(int i=0; i<10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			while(a < b) {
				int tmp = arr[a];
				arr[a] = arr[b];
				arr[b] = tmp;
				
				a++;
				b--;
			}
		}
		
		for(int i=1; i<21; i++) {
			bw.write(Integer.toString(arr[i]));
			
			if(i != 20) bw.write(" ");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}
