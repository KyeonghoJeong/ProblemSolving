package DataStructure.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekjoonOnlineJudge10808 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		int[] arr = new int[26];
		
		for(int i=0; i<s.length(); i++) arr[s.charAt(i) - 97]++;
		
		for(int i=0; i<26; i++) {
			bw.write(Integer.toString(arr[i]));
			
			if(i != 25) bw.write(" ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}