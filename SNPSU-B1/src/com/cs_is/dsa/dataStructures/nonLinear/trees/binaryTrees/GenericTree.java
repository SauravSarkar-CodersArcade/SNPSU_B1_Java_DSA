package com.cs_is.dsa.dataStructures.nonLinear.trees.binaryTrees;
public class GenericTree<X> {
    private final X data;
    private GenericTree<X> left;
    private GenericTree<X> right;
    public GenericTree(X data){
        this.data = data;
        this.left = this.right = null;
    }
    void preOrder(){
        System.out.print(this.data + " ");
        if (this.left != null) this.left.preOrder();
        if (this.right != null) this.right.preOrder();
    }
    void inOrder(){
        if (this.left != null) this.left.inOrder();
        System.out.print(this.data + " ");
        if (this.right != null) this.right.inOrder();
    }
    void postOrder(){
        if (this.left != null) this.left.postOrder();
        if (this.right != null) this.right.postOrder();
        System.out.print(this.data + " ");
    }
    public static void main(String[] args) {
        // This is tree of integers
        GenericTree<Integer> integerRoot = new GenericTree<>(1);
        integerRoot.left = new GenericTree<>(2);
        integerRoot.right = new GenericTree<>(3);
        System.out.println("PreOrder Integer Tree:");
        integerRoot.preOrder();
        System.out.println();
        System.out.println("InOrder Integer Tree:");
        integerRoot.inOrder();
        System.out.println();
        System.out.println("PostOrder Integer Tree:");
        integerRoot.postOrder();
        System.out.println();
        // This is a tree of floats
        GenericTree<Float> floatRoot = new GenericTree<>(1.2f);
        floatRoot.left = new GenericTree<>(2.4f);
        floatRoot.right = new GenericTree<>(4.6f);
        System.out.println("PreOrder Float Tree:");
        floatRoot.preOrder();
        System.out.println();
        System.out.println("InOrder Float Tree:");
        floatRoot.inOrder();
        System.out.println();
        System.out.println("PostOrder Float Tree:");
        floatRoot.postOrder();
        System.out.println();
        // This is a tree of booleans
        GenericTree<Boolean> booleanRoot = new GenericTree<>(true);
        booleanRoot.left = new GenericTree<>(false);
        booleanRoot.right = new GenericTree<>(true);
        System.out.println("PreOrder Boolean Tree:");
        booleanRoot.preOrder();
        System.out.println();
        System.out.println("InOrder Boolean Tree:");
        booleanRoot.inOrder();
        System.out.println();
        System.out.println("PostOrder Boolean Tree:");
        booleanRoot.postOrder();
        System.out.println();
    }
}
