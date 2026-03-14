package com.cs_is.dsa.dataStructures.nonLinear.trees.binaryTrees.traversals.bfs;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class BinaryTree {
    public static void levelOrderTraversalOrBFS(TreeNode root){
        // Base Case // Corner Case // Edge Case
        if (root == null){
            return;
        }
        // You are pushing nodes into the queue, not integers
        Queue<TreeNode> queue = new LinkedList<>();
        // Add the root node into the queue & then traverse left & right
        queue.add(root);
        // Print all nodes level by level till the queue is empty
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll(); // Removes & stores the front node
            System.out.print(temp.data + " ");
            // Left Subtree
            if (temp.left != null){
                queue.add(temp.left);
            }
            // Right Subtree
            if (temp.right != null){
                queue.add(temp.right);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // L0
        TreeNode root = new TreeNode(1);
        // L1
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        // L2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println("BFS or Level Order Traversal: ");
        levelOrderTraversalOrBFS(root);
    }
}
