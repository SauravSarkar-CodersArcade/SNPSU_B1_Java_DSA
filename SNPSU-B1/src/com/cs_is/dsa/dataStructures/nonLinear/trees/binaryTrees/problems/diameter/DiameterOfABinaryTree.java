package com.cs_is.dsa.dataStructures.nonLinear.trees.binaryTrees.problems.diameter;
public class DiameterOfABinaryTree {
    static class Node {
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
        }
    }
    static int diameter = 0;
    static int height(Node root){
        if (root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left + right); // Diameter
        return Math.max(left, right) + 1; // Height
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        height(root);
        System.out.println("Diameter of the tree: " + diameter);
    }
}
