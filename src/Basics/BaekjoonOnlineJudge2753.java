package Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekjoonOnlineJudge2753 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int year = Integer.parseInt(br.readLine());
		String result = "0";
		
		if(year%4 == 0) {
			if(year%100 != 0 || year%400 == 0) result = "1";			
		}
		
		bw.write(result);
		
		bw.flush();
		bw.close();
		br.close();
	}

}