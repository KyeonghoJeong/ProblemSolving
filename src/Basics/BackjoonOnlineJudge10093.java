package Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BackjoonOnlineJudge10093 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long start = a;
		long end = b;
		
		if(a > b) {
			start = b;
			end = a;
		}
		
		if(a == b) bw.write("0\n");
		else bw.write(Long.toString(Math.abs(b-a) - 1)+"\n");
		
		for(long i=start+1; i<end; i++) {
			bw.write(Long.toString(i));
			
			if(i != b-1) bw.write(" ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}