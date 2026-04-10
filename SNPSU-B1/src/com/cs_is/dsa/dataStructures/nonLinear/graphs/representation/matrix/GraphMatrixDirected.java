package com.cs_is.dsa.dataStructures.nonLinear.graphs.representation.matrix;
import java.util.Scanner;

public class GraphMatrixDirected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n -> number of nodes
        // m -> number of edges
        // We cover all the nodes, so Time Complexity is O(n)
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] adjMatrix = new int[n+1][n+1]; // 0-based indexing
        // Let's take input of the edges from the user
        for (int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // directed Graph u --> v
            adjMatrix[u][v] = 1;
            // adjMatrix[v][u] = 1; // Skip this line for Directed Graph
        }
        // Print the adjacency matrix
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
