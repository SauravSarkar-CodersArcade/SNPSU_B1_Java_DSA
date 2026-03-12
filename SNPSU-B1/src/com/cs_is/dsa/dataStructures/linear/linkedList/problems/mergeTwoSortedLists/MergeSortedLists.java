package com.cs_is.dsa.dataStructures.linear.linkedList.problems.mergeTwoSortedLists;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
public class MergeSortedLists {
    static Node mergeSortedLists(Node l1, Node l2){
        Node dummy = new Node(0);
        Node tail = dummy;
        while (l1 != null && l2 != null){
            if(l1.data < l2.data){
                tail.next = l1;
                l1 = l1.next;
            }else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        // Attach remaining node by just copy & paste
        if(l1 != null){
            tail.next = l1;
        }else {
            tail.next = l2;
        }
        return dummy.next; // Because dummy is pointing to 0
    }
    static void printList(Node head){
        while (head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);
        l2.next.next.next = new Node(8);
        Node merged = mergeSortedLists(l1, l2);
        printList(merged);
    }
}
