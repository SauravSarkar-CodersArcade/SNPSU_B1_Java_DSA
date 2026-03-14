package com.cs_is.dsa.dataStructures.nonLinear.trees.binaryTrees.problems.lca;
public class LCAExample {
    static class Node {
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
        }
    }
    static Node findLCA(Node root, int n1, int n2){
        if (root == null){
            return null;
        }
        if (root.data == n1 || root.data == n2){
            return root;
        }
        Node left = findLCA(root.left, n1, n2);
        Node right = findLCA(root.right, n1, n2);
        if (left != null && right != null){
            return root;
        }
        return (left != null ? left : right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        Node lca = findLCA(root, 4, 5);
        System.out.println("LCA: " + lca.data);
    }
}
