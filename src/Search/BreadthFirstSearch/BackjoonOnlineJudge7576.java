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

public class BackjoonOnlineJudge7576 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[][] box = new int[n][m];
		int[][] days = new int[n][m];
		
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<m; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
				days[i][j] = -1;
				
				if(box[i][j] == 0) {
					cnt++;
					days[i][j] = -2;
				}
			}
		}
		
		if(cnt == 0) {
			bw.write("0");
		}else {
			Queue<Point> queue = new LinkedList<>();
			
			int[] dx = {0, 1, 0, -1};
			int[] dy = {1, 0, -1, 0};
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(box[i][j] == 1) {
						days[i][j] = 0;
						queue.add(new Point(i, j));
					}
				}
			}

			while(!queue.isEmpty()) {
				Point point = queue.poll();
				
				for(int i=0; i<4; i++) {
					int x = point.x + dx[i];
					int y = point.y + dy[i];

					if(x < 0 || x >= n || y < 0 || y >= m) continue;
					if(box[x][y] != 0 || days[x][y] >= 0) continue;
					
					days[x][y] = days[point.x][point.y] + 1;
					
					queue.add(new Point(x, y));
				}
			}
			
			int max = 0;
			boolean check = false;
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(days[i][j] > max) max = days[i][j];
					
					if(days[i][j] == -2) check = true;
				}
			}
			
			if(check == true) bw.write("-1");
			else bw.write(Integer.toString(max));
		}
			
		bw.flush();
		bw.close();
		br.close();
	}
	
}
