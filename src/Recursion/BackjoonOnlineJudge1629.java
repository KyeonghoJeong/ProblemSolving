package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BackjoonOnlineJudge1629 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		long c = Integer.parseInt(st.nextToken());
		
		long result = func(a, b, c);
		
		bw.write(Long.toString(result));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static long func(long a, long b, long c) {
		if(b == 1) return a % c;
		
		long result = func(a, b/2, c);
		
		if(b%2 == 0) {
			return (result * result) % c;
		}else {
			return (result * ((result * (a % c)) % c)) % c;
			// return result * result % c * a % c;
		}
	}
	
}