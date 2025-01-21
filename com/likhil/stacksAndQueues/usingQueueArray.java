package com.likhil.stacksAndQueues;

import com.likhil.stacksAndQueues.queueWithArray;

public class usingQueueArray {
    public static void main(String[] args) {
        queueWithArray q = new queueWithArray();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.dequeue();
        q.dequeue();
        q.enqueue(5);
        q.dequeue();
        System.out.println(q.peek());
        System.out.println(q.size());
    }

}
