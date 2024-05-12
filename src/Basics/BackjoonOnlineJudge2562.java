package Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackjoonOnlineJudge2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 0;
		int idx = 0;
		
		for(int i=1; i<10; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num > max) {
				max = num;
				idx = i;
			}
		}
		
		bw.write(Integer.toString(max)+"\n");
		bw.write(Integer.toString(idx));
		
		bw.flush();
		bw.close();
		br.close();
	}

}