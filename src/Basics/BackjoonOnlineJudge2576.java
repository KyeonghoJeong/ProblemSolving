package Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;

public class BackjoonOnlineJudge2576 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[7];
		
		for(int i=0; i<7; i++) arr[i] = Integer.parseInt(br.readLine());
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		for(int i=0; i<7; i++) if(arr[i] % 2 != 0) linkedList.add(arr[i]);
		
		Collections.sort(linkedList);
		
		int sum = 0;
		
		for(int i=0; i<linkedList.size(); i++) sum += linkedList.get(i);
		
		if(linkedList.size() == 0) bw.write("-1");
		else {
			bw.write(Integer.toString(sum)+"\n");
			bw.write(Integer.toString(linkedList.get(0)));	
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
