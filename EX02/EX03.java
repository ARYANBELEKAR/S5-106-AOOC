import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Demo.setValue(num);   // setting static variable
        Demo.show();          // calling static method

        sc.close();
    }
}

class Demo {

    static int x;   // static variable


    static {
        System.out.println("Static block executed");
        x = 0;
    }

  
    static void setValue(int value) {
        x = value;
    }

    
    static void show() {
        System.out.println("Value of x = " + x);
    }
}