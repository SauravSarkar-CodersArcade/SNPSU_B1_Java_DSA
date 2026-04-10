package com.cs_is.dsa.dataStructures.nonLinear.graphs.questions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Count the number of nodes & edges of an Undirected Graph
public class GraphNodeEdgeCount {
    public static int countNodes(List<List<Integer>> adjList){
        return adjList.size();
    }
    public static int countEdges(List<List<Integer>> adjList){
        int edges = 0;
        for (List<Integer> neighbour : adjList){
            edges += neighbour.size();
        }
        // Since it is an undirected graph, edges are counted twice
        // So we divide by 2
        return edges / 2;
    }
    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        // Manually adding the adjacency list representation
        adjList.add(Arrays.asList(1, 2)); // Node 0 // S=2
        adjList.add(Arrays.asList(0, 2, 3)); // Node 1 // S=3
        adjList.add(Arrays.asList(0, 1, 4)); // Node 2 // S=3
        adjList.add(Arrays.asList(1, 4)); // Node 3 // S=2
        adjList.add(Arrays.asList(2, 3)); // Node 4 // S=2

        int nodes = countNodes(adjList);
        System.out.println("No of nodes: " + nodes);
        int edges = countEdges(adjList);
        System.out.println("No of edges: " + edges);
    }
}
