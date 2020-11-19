import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Graph{
	int V; 	//no.of vertices
	Vector<Integer>[] adj; 

		@SuppressWarnings("unchecked") 
		Graph(int V) 
		{ 
			// Constructor 
			this.V = V; 
			this.adj = new Vector[V]; 
			for (int i = 0; i < V; i++) 
				adj[i] = new Vector<>(); 
		} 

	void addEdge(int v,int a){
		adj[v].add(a);
	}
	boolean isCycleBFS(int src){
		int visited[] = new int[this.V];
		Arrays.fill(visited,0);
		int parent[] = new int[this.V];
		Arrays.fill(parent,0);
		Queue<Integer> q = new LinkedList<>();

		visited[src]=1;
		parent[src]=src;
		q.add(src);

		while(q.size() != 0){
			src = q.poll();
			for(int a : adj[src])	{
				if(visited[a] == 1 && parent[src]!=a)
					return true;
				else if(visited[a] == 0){
					q.add(a);
					visited[a]=1;
					parent[a]=src;
				}	
			}		
		}
		return false;		
	}
	public static void main(String[] args) 
	{ 

		// Create a graph given in the above diagram 
		Graph g = new Graph(6); 
		g.addEdge(0, 1); 
		g.addEdge(1, 2); 
		g.addEdge(2, 3); 
		g.addEdge(3, 4); 
		g.addEdge(4, 5); 

		if (g.isCycleBFS(0)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	} 
}

