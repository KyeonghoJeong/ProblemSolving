package Search.BreadthFirstSearch;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BackjoonOnlineJudge2178 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] maze = new int[n][m];
		int[][] distances = new int[n][m];
		
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			
			for(int j=0; j<m; j++) {
				maze[i][j] = (int) s.charAt(j) - 48;
			}
		}
		
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		Queue<Point> queue = new LinkedList<>();
		
		queue.add(new Point(0, 0));
		
		distances[0][0] = 1;
		
		while(!queue.isEmpty()) {
			Point point = queue.poll();
			
			for(int i=0; i<4; i++) {
				int x = point.x + dx[i];
				int y = point.y + dy[i];
				
				if(x < 0 || x >= n || y < 0 || y >= m) continue;
				if(distances[x][y] != 0 || maze[x][y] == 0) continue;
				
				distances[x][y] = distances[point.x][point.y] + 1;
				
				queue.add(new Point(x, y));
			}
		}
		
		bw.write(Integer.toString(distances[n-1][m-1]));
		
		bw.flush();
		bw.close();
		br.close();
	}

}
