package com.likhil.linkedlist;

public class LinkedList {
    private Node head;
    // private Node tail;

    public LinkedList(int data) {
        head = new Node(data);
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    protected void insertAtFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    protected void insertAtLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            insertAtFirst(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    protected void insertAt(int index, int data) {
        Node node = new Node(data);
        if (index == 0) {
            insertAtFirst(data);
        }
        Node temp = head;
        int current = 0;
        while (current + 1 != index) {
            temp = temp.next;
            current++;
        }
        if (temp.next.next != null) {
            node.next = temp.next.next;
            temp.next = node;
        } else {
            temp.next = node;
        }
    }

    protected void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    protected void removeAtFirst() {
        head = head.next;
    }

    protected void removeAtLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

    }
}
