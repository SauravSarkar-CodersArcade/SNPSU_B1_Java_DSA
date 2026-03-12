package com.cs_is.dsa.dataStructures.linear.linkedList.problems.evenOddFiltering;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
public class EvenOddLinkedList {
    static Node head = null;
    static void insert(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    static void printEven(){
        Node temp = head;
        while (temp != null){
            if (temp.data % 2 == 0){
                System.out.print(temp.data + " ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    static void printOdd(){
        Node temp = head;
        while (temp != null){
            if (temp.data % 2 != 0){
                System.out.print(temp.data + " ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            insert(sc.nextInt());
        }
        printEven();
        printOdd();
    }
}

