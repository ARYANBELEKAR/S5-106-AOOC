public class EX1B {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int i;

        for (i = 2; i < n; i++) {
            if (n % i == 0)
                break;
        }

        if (i == n)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}