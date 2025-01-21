package com.likhil.stacksAndQueues;

import com.likhil.stacksAndQueues.StackWithArray;

public class usingStackArray {
    public static void main(String[] args) {
        StackWithArray stack = new StackWithArray();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.size());
        System.out.println(stack.top());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.top());
    }

}
