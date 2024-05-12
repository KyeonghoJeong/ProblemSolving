package Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackjoonOnlineJudge2440 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		for(int i=n; i>=1; i--) {
			for(int j=0; j<i; j++) bw.write("*");
			
			if(i != 1) bw.write("\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}
