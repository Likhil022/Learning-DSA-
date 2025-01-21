package com.likhil.stacksAndQueues;

public class queueWithArray {
    private int size = 10;
    private int[] queue = new int[size];
    private int front = -1;
    private int rear = -1;

    public void enqueue(int x) {
        if (front == size - 1) {
            System.err.println("Queue is full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = rear + 1;
        queue[rear] = x;
    }

    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        int el = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = front + 1;
        }
        return el;
    }

    public int peek() {
        if (front == -1) {
            System.err.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public int size() {
        if (front == -1) {
            return 0;
        }
        return rear - front + 1;
    }
}
