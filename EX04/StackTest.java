// STACK INTERFACE
interface Stack {
    int size = 5;   // stack size

    void push(int x);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}

// INTEGER STACK IMPLEMENTATION
class IntegerStack implements Stack {

    int arr[] = new int[size];
    int top = -1;

    public void push(int x) {
        if (overflow()) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = x;
            System.out.println(x + " inserted");
        }
    }

    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top--];
        }
    }

    public void display() {
        if (underflow()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

// TEST CLASS
public class StackTest {
    public static void main(String[] args) {

        IntegerStack s = new IntegerStack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);   // overflow check

        s.display();

        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());

        s.display();
    }
}