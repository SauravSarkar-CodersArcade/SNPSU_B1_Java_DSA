package com.cs_is.dsa.dataStructures.linear.linkedList.problems.middleOfLinkedList;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
public class MiddleOfLinkedList {
    static int findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next; // move 1 step
            fast = fast.next.next; // move 2 steps
        }
        return slow.data;
    }
    public static void main(String[] args) {
        // Example 1
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        System.out.println("Middle Node data: " + findMiddle(head1));
        // Example 2
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5);
        head2.next.next.next.next.next = new Node(6);
        System.out.println("Middle Node data: " + findMiddle(head2));
    }

}
