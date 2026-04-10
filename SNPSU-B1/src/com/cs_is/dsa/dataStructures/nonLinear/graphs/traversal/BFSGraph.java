package com.cs_is.dsa.dataStructures.nonLinear.graphs.traversal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class GraphBFS {
    public List<Integer> bfsGraph(int V, List<List<Integer>> adjList){
        List<Integer> bfs = new ArrayList<>(); // This is our answer
        boolean[] visited = new boolean[V + 1]; // Works for 0 or 1
        Queue<Integer> q = new LinkedList<>();
        // Start the BFS from node 1
        visited[1] = true;
        q.add(1);
        while (!q.isEmpty()){
            int node = q.poll();
            bfs.add(node); // We are storing the output one by one
            // Who are your neighbours [Adjacency List]
            // Traverse all of its neighbours if not visited
            for (int neighbour : adjList.get(node)){
                if (!visited[neighbour]){
                    visited[neighbour] = true; // Mark as visited
                    q.add(neighbour); // Push to queue
                }
            }
        }
        return bfs;
    }
}
public class BFSGraph {
    public static void main(String[] args) {
        int V = 5; // Number of nodes
        // Adjacency List Representation
        List<List<Integer>> adjList = new ArrayList<>();
        // If we use this structure List<List<>>, we need to
        // initialize to empty lists first
        // Node 1: {}, Node 2: {}, Node 3: {} an so on
        for (int i=0; i<=V; i++){
            adjList.add(new ArrayList<>());
        }
        // Adding the edges (Undirected Graph)
        addEdge(adjList, 1,2);
        addEdge(adjList, 1,3);
        addEdge(adjList, 2,3);
        addEdge(adjList, 3,4);
        addEdge(adjList, 4,5);
        addEdge(adjList, 2,5);
        GraphBFS obj = new GraphBFS();
        List<Integer> ans = obj.bfsGraph(V, adjList);
        printBFS(ans);
    }
    public static void addEdge(List<List<Integer>> adjList, int u,
                               int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u); // Undirected u <--> v
    }
    // Method to Print the BFS Result
    public static void printBFS(List<Integer> ans){
        for (int num : ans){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
