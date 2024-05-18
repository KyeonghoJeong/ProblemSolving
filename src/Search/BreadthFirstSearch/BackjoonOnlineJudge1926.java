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

public class BackjoonOnlineJudge1926 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] painting = new int[n][m];
		boolean[][] visited = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<m; j++) {
				painting[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int num = 0;
		int max = 0;
		
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		Queue<Point> queue = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(visited[i][j] || painting[i][j] == 0) continue;
				
				int area = 0;
				num++;
				
				visited[i][j] = true;
				
				queue.add(new Point(i, j));
				
				while(!queue.isEmpty()) {
					Point point = queue.poll();
					
					area++;
					
					for(int k=0; k<4; k++) {
						int x = point.x + dx[k];
						int y = point.y + dy[k];
						
						if(x < 0 || x >= n || y < 0 || y >= m) continue;
						if(visited[x][y] || painting[x][y] == 0) continue;
						
						visited[x][y] = true;
						
						queue.add(new Point(x, y));
					}
				}
				
				if(area > max) max = area;
			}
		}
		
		bw.write(Integer.toString(num)+"\n");
		bw.write(Integer.toString(max));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
