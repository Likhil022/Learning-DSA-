package com.likhil.linkedlist;


public class LinkedListOperations {
    public static void main(String[] args) {
     LinkedList list = new LinkedList(5);
     list.insertAtFirst(4);
     list.insertAtLast(6);
     list.insertAtLast(7);
     list.display();
     list.removeAtLast();
     list.display();

    }
}
