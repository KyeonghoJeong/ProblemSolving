package Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BackjoonOnlineJudge2490 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<3; i++) {
			String result = "";
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			int sum = a + b + c + d;
			
			switch(sum) {
				case 3:
					result = "A";
					break;
				case 2:
					result = "B";
					break;
				case 1:
					result = "C";
					break;
				case 0:
					result = "D";
					break;
				case 4:
					result = "E";
					break;
			}
			
			bw.write(result);
			
			if(i < 2) bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
