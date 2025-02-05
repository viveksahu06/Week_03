package com.practiceproblem.stack_queue;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> StackIn;
    private Stack<Integer> StackOut;

    // constructor to initialize the stacks
    public QueueUsingStack() {
        StackIn = new Stack<>();
        StackOut = new Stack<>();
    }

    // method to add an element to the queue
    public void Enqueue(int x) {
        StackIn.push(x);
    }

    // method to remove and return the front element from the queue
    public int Dequeue() {
        // If StackOut is empty, transfer elements from StackIn
        if (StackOut.isEmpty()) {
            if (StackIn.isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            while (!StackIn.isEmpty()) {
                StackOut.push(StackIn.pop());
            }
        }
        return StackOut.pop();
    }

    // method to get the front element without removing it
    public int peek() {
        // ff StackOut is empty, transfer elements from StackIn
        if (StackOut.isEmpty()) {
            if (StackIn.isEmpty()) {
                // If both stacks are empty, queue is empty
                System.out.println("Queue is Empty");
                return -1;
            }
            while (!StackIn.isEmpty()) {
                StackOut.push(StackIn.pop());
            }
        }
        return StackOut.peek();
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return StackOut.isEmpty() && StackIn.isEmpty();
    }

    // Main method to test the queue implementation
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);

        System.out.println(queue.Dequeue()); // Output: 1
        System.out.println(queue.Dequeue()); // Output: 2
        System.out.println(queue.Dequeue()); // Output: 3
        System.out.println(queue.isEmpty()); // Output: true
    }
}
