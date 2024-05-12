package Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BackjoonOnlineJudge1267 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int y = 0;
		int m = 0;
		
		while(n-- > 0) {
			int sec = Integer.parseInt(st.nextToken());

			y += (sec / 30 + 1) * 10;
			m += (sec / 60 + 1) * 15;
		}
		
		if(y < m) {
			bw.write("Y "+Integer.toString(y));
		}else if(y > m) {
			bw.write("M "+Integer.toString(m));
		}else {
			bw.write("Y M "+Integer.toString(y));
		}

		bw.flush();
		bw.close();
		br.close();
	}

}