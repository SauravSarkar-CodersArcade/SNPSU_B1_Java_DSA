package com.cs_is.dsa.dataStructures.nonLinear.trees.binaryTrees.traversals.dfs;
public class TreeNode {
    int data; // The data of the node
    TreeNode left; // The reference to the left child
    TreeNode right; // The reference to the right child
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null; // Initially the node has no children
    }
    public static void preOrder(TreeNode root){ // DLR
        if (root != null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(TreeNode root){ // LDR
        if (root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static void postOrder(TreeNode root){ // LRD
        if (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        // Rule for constructing the Binary Tree => Top to bottom & left to right
        // Level 0
        TreeNode root = new TreeNode(1);
        // Level 1
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        // Level 2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        // Level 3
        root.left.right.left = new TreeNode(9);
        root.right.right.left = new TreeNode(15);
        System.out.println("PreOrder Traversal: ");
        preOrder(root);
        System.out.println();
        System.out.println("InOrder Traversal: ");
        inOrder(root);
        System.out.println();
        System.out.println("PostOrder Traversal: ");
        postOrder(root);
        System.out.println();
    }
}
