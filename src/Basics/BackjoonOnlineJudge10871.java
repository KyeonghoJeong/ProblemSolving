package Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BackjoonOnlineJudge10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		while(n-- > 0) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num < x) {
				bw.write(Integer.toString(num));
				
				if(n > 0) bw.write(" ");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
