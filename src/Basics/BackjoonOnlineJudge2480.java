package Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BackjoonOnlineJudge2480 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int reward = 0;
		
		if(a==b && b==c && a==c) {
			reward = 10000 + a * 1000;
		}else if(a==b || b==c || a==c) {
			if(a==b || a==c) reward = 1000 + a * 100;
			else reward = 1000 + b * 100;
		}else {
			int max = 0;
			
			if(a > b) {
				if(b > c) {
					max = a;
				}
				else {
					if(a > c) max = a;
					else max = c;
				}
			}else {
				if(b > c) {
					max = b;
				}else {
					max = c;
				}
			}
			
			reward = max * 100;
		}
		
		bw.write(Integer.toString(reward));
		
		bw.flush();
		bw.close();
		br.close();
	}

}
