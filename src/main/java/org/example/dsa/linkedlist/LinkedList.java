package org.example.dsa.linkedlist;

import java.util.HashSet;
import java.util.Set;


public class LinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void removeDuplicates() {
        Set<Integer> values = new HashSet<>();

        Node current = head;
        Node previous = null;

        while(current != null) {
            if(!values.add(current.value)) {
                previous.next = current.next;
                current = current.next;
            } else {
                previous = current;
                current = current.next;
            }

        }
    }


    public void reverseBetween(int m, int n) {
        if (head == null || m == n) return;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        for (int i = 0; i < m; i++) {
            prev = prev.next;
        }
        Node curr = prev.next;
        for (int i = 0; i < (n - m); i++) {
            Node move = curr.next;
            curr.next = move.next;
            move.next = prev.next;
            prev.next = move;
        }
        head = dummy.next;
    }


    public void swapPairs() {
        if (head == null || head.next == null) {
            return;
        }

        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = first.next;
            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }

        head = dummy.next;
    }



}


