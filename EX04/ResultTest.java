// STUDENT CLASS
class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }
}

// TEST CLASS (inherits Student)
class Test extends Student {
    int sub1, sub2;

    void setMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void getMarks() {
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}

// SPORTS INTERFACE
interface Sports {
    int sMarks = 20;   // sports marks (default public static final)

    void set();        // method declaration
}

// RESULT CLASS (inherits Test and implements Sports)
class Result extends Test implements Sports {

    int total;

    public void set() {
        total = sub1 + sub2 + sMarks;
    }

    void display() {
        System.out.println("Roll No: " + getRollNo());
        getMarks();
        System.out.println("Sports Marks: " + sMarks);
        System.out.println("Total Marks: " + total);
    }
}

// TEST APPLICATION
public class ResultTest {
    public static void main(String[] args) {

        Result r = new Result();

        r.setRollNo(101);
        r.setMarks(75, 85);
        r.set();      // calculate total
        r.display();
    }
}