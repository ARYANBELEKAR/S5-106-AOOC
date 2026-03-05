import java.util.Scanner;

public class EX1E {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] result = new int[2][2];

        System.out.println("Enter elements of first 2x2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter elements of second 2x2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = sc.nextInt();

        System.out.println("\n1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Transpose (First Matrix)");
        System.out.print("Choose operation: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1: // Addition
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        result[i][j] = a[i][j] + b[i][j];
                break;

            case 2: // Multiplication
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            result[i][j] += a[i][k] * b[k][j];
                        }
                    }
                }
                break;

            case 3: // Transpose of first matrix
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        result[i][j] = a[j][i];
                break;

            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Result:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}