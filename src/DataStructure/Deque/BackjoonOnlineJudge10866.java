package DataStructure.Deque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BackjoonOnlineJudge10866 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		CustomDeque<Integer> customDeque = new CustomDeque<>();
		
		while(n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push_front":
				customDeque.addFirst(Integer.parseInt(st.nextToken()));
				
				break;
			case "push_back":
				customDeque.addLast(Integer.parseInt(st.nextToken()));
				
				break;
			case "pop_front":
				if(customDeque.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(Integer.toString(customDeque.pollFirst())+"\n");
				}
				
				break;
			case "pop_back":
				if(customDeque.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(Integer.toString(customDeque.pollLast())+"\n");
				}
				
				break;	
			case "size":
				bw.write(Integer.toString(customDeque.size())+"\n");
				
				break;			
			case "empty":
				if(customDeque.isEmpty()) {
					bw.write("1\n");
				}else {
					bw.write("0\n");
				}
				
				break;			
			case "front":
				if(customDeque.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(Integer.toString(customDeque.peekFirst())+"\n");
				}
				
				break;		
			case "back":
				if(customDeque.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(Integer.toString(customDeque.peekLast())+"\n");
				}
				
				break;		
			}
			
			bw.flush();
		}
		
		bw.close();
		br.close();
	}
	
}
