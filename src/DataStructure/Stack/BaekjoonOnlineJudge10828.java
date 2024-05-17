package DataStructure.Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekjoonOnlineJudge10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		CustomStack<Integer> customStack = new CustomStack<>();
		
		while(n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push":
				customStack.add(Integer.parseInt(st.nextToken()));
				
				break;
			case "pop":
				if(customStack.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(Integer.toString(customStack.pop())+"\n");
				}
				
				break;			
			case "size":
				bw.write(Integer.toString(customStack.size())+"\n");
				
				break;			
			case "empty":
				if(customStack.isEmpty()) {
					bw.write("1\n");
				}else {
					bw.write("0\n");
				}
				
				break;			
			case "top":
				if(customStack.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(String.valueOf(customStack.peek())+"\n");
				}
				
				break;		
			}
			
			bw.flush();
		}
		
		bw.close();
		br.close();
	}
	
}

