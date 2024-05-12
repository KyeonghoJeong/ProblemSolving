package Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackjoonOnlineJudge9498 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int score = Integer.parseInt(br.readLine());
		char result = ' ';
		
		switch(score/10) {
			case 10: case 9:
				result = 'A';
				break;
			case 8:
				result = 'B';
				break;
			case 7:
				result = 'C';
				break;
			case 6:
				result = 'D';
				break;
			default:
				result = 'F';
				break;
		}
		
		bw.write(Character.toString(result));
		
		bw.flush();
		bw.close();
		br.close();
	}

}
