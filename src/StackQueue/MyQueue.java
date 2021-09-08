package StackQueue;

// 232. Implement Queue using Stacks

//Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
//
//        Implement the MyQueue class:
//
//        void push(int x) Pushes element x to the back of the queue.
//        int pop() Removes the element from the front of the queue and returns it.
//        int peek() Returns the element at the front of the queue.
//        boolean empty() Returns true if the queue is empty, false otherwise.
//        Notes:
//
//        You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
//        Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.


import java.util.Stack;

public class MyQueue {
    /** Initialize your data structure here. */
    Stack<Integer> stack;
    Stack<Integer> temp;

    public MyQueue() {
        stack = new Stack<>();
        temp = new Stack<>();
    }

    public void exchange() {
        while (!temp.empty()) {
            stack.push(temp.pop());
        }
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        temp.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stack.empty()) {
            exchange();
        }
        return stack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (stack.empty()) {
            exchange();
        }
        return stack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.empty() && temp.empty();
    }
}
