package DataStructure.Queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BackjoonOnlineJudge10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		CustomQueue<Integer> customQueue = new CustomQueue<>();
		
		while(n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push":
				customQueue.add(Integer.parseInt(st.nextToken()));
				
				break;
			case "pop":
				if(customQueue.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(Integer.toString(customQueue.poll())+"\n");
				}
				
				break;			
			case "size":
				bw.write(Integer.toString(customQueue.size())+"\n");
				
				break;			
			case "empty":
				if(customQueue.isEmpty()) {
					bw.write("1\n");
				}else {
					bw.write("0\n");
				}
				
				break;			
			case "front":
				if(customQueue.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(Integer.toString(customQueue.peek())+"\n");
				}
				
				break;		
			case "back":
				if(customQueue.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(Integer.toString(customQueue.back())+"\n");
				}
				
				break;		
			}
			
			bw.flush();
		}
		
		bw.close();
		br.close();
	}
	
}