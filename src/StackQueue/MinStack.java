package StackQueue;

// 155. Min Stack
// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
// Implement the MinStack class:
//
//        MinStack() initializes the stack object.
//        void push(val) pushes the element val onto the stack.
//        void pop() removes the element on the top of the stack.
//        int top() gets the top element of the stack.
//        int getMin() retrieves the minimum element in the stack.


import java.util.Stack;

public class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val < minStack.peek()) minStack.push(val);
        else minStack.push(minStack.peek());
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
