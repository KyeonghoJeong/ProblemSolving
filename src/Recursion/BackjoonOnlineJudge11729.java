package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackjoonOnlineJudge11729 {
	
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		sb.append((int) Math.pow(2, n) - 1);
		System.out.println(sb.toString());
		
		sb.setLength(0);
		
		func(1, 3, n);
		System.out.println(sb.toString());
		
		br.close();
	}
	
	public static void func(int start, int end, int num) {
		if(num == 1) {
			sb.append(start+" "+end+"\n");
			return;
		}
		
		func(start, 6-start-end, num-1);
		sb.append(start+" "+end+"\n");
		func(6-start-end, end, num-1);
	}
	
}