package com.cs_is.dsa.dataStructures.nonLinear.graphs.algos;
import java.util.*;

public class DijkstrasPQMinHeap {
    public static List<Integer> dijkstra(int V, List<List<Pair>> adj,
                                         int S){
        // Sorting the pq according to the minimum distance
        PriorityQueue<Pair> pq = new PriorityQueue<>
                (Comparator.comparingInt(p -> p.distance));
        // Initially the distance array has all large value (unreachable)
        List<Integer> distTo = new ArrayList<>(
                Collections.nCopies(V, Integer.MAX_VALUE));
        // The distance to the source node is 0
        distTo.set(S,0);
        pq.offer(new Pair(S, 0));
        // If we get a better distance - update [Relaxation]
        while (!pq.isEmpty()){
            Pair current = pq.poll(); // {dist, node}
            int node = current.node;
            int dist = current.distance;
            for (Pair neighbour : adj.get(node)){
                int v = neighbour.node;
                int w = neighbour.distance;
                if (dist + w < distTo.get(v)){
                    distTo.set(v, dist + w); // Relaxation of edges
                    pq.offer(new Pair(v, dist + w));
                }
            }
        }
        return distTo;
    }
    static class Pair {
        int node, distance;
        Pair(int node, int distance){
            this.node = node;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        int V = 6, S = 0;
        List<List<Pair>> adj = new ArrayList<>();
        for (int i=0; i<V; i++){
            adj.add(new ArrayList<>()); // Adding empty arrays for storage
        }
        // Undirected Weighted Graph
        adj.get(0).add(new Pair(1,4));
        adj.get(0).add(new Pair(2,4));
        adj.get(1).add(new Pair(0,4));
        adj.get(1).add(new Pair(2,2));
        adj.get(2).add(new Pair(0,4));
        adj.get(2).add(new Pair(1,2));
        adj.get(2).add(new Pair(3,3));
        adj.get(2).add(new Pair(4,1));
        adj.get(2).add(new Pair(5,6));
        adj.get(3).add(new Pair(2,3));
        adj.get(3).add(new Pair(5,2));
        adj.get(4).add(new Pair(2,1));
        adj.get(4).add(new Pair(5,3));
        adj.get(5).add(new Pair(2,6));
        adj.get(5).add(new Pair(3,2));
        adj.get(5).add(new Pair(4,3));
        List<Integer> shortestDistanceArray = dijkstra(V, adj, S);
        System.out.println("Shortest Distance from node: " +
                S + " : ");
        for (int i=0; i<V; i++){
            System.out.print(shortestDistanceArray.get(i) + " ");
        }
        System.out.println();
        // System.out.println(shortestDistanceArray);
    }
}
