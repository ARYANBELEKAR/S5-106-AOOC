public class EX1D {

    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};

        int[] c = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }

        System.out.println("Merged Array:");

        for (int x = 0; x < c.length; x++) {
            System.out.print(c[x] + " ");
        }
    }
}