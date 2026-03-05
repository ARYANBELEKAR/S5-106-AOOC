import java.util.Scanner;

public class Q4 {

    static int stack[] = new int[5];
    static int top = -1;

    static int queue[] = new int[5];
    static int front = -1, rear = -1;

    static void push(int value) {
        if (top == 4) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + stack[top--]);
        }
    }

    static void enqueue(int value) {
        if (rear == 4) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) front = 0;
            queue[++rear] = value;
            System.out.println("Enqueued: " + value);
        }
    }

    static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Dequeued: " + queue[front++]);
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        pop();

        enqueue(100);
        enqueue(200);
        dequeue();
    }
}