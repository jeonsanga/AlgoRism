package algoRism;

import java.util.LinkedList;
import java.util.Queue;

public class nan {
	
	public static void main(String[] args) {
		int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
		Queue queue = new LinkedList();
		boolean[] visited = new boolean[9];
	}
	
	static String bfs(int start, int[][] graph, boolean[] visited) {
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		visited[start] = true;
		
		while(!q.isEmpty()) {
			int nodeIndex = q.poll();
			sb.append(nodeIndex + " -> ");
			for(int i=0; i<graph[nodeIndex].length; i++) {
				
			}
		}
		
		return null;
	}
}
