package com.likhil.linkedlist;

public class LL {
    private Node head;
    // private Node tail;

    public LL(int data) {
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
        if (index == 0) {
            insertAtFirst(data);
            return;
        }
        Node temp = head;
        int current = 0;
        while (current + 1 != index && temp.next != null) {
            temp = temp.next;
            current++;
        }
        if (current + 1 != index) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        node.next = temp.next;
        temp.next = node;
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

    protected void removeAt(int index) {
        if (head == null || index < 0) {
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        int current = 0;
        Node temp = head;
        while (current + 1 != index && temp.next != null) {
            temp = temp.next;
            current++;
        }
        if (temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
    }

    protected void removeElement(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if (temp.next != null && temp.next.data == data) {
            temp.next = temp.next.next;
        }
    }

    protected Node reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }
}
