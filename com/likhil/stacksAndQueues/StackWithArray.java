package com.likhil.stacksAndQueues;

public class StackWithArray {
    private int size = 10;
    private int[] stack = new int[size];
    private int top = -1;

    public void push(int x) {
        if (top + 1 == size) {
            System.out.println("Stack is full");
            return;
        }
        top = top + 1;
        stack[top] = x;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        int el = stack[top];
        top = top - 1;
        return el;
    }

    public int top() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];

    }

    public int size() {
        return top + 1;
    }

}
