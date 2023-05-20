package sortingAlgorithms;

/**
 *
 * @author akifkilic
 */
import java.util.*;
// create an random array and sort it with shell Sort
public class shell_Sort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i, bos, n, g;
        boolean durum;
        System.out.println("Please join the array size n :");
        n = input.nextInt();
        int[] A = new int[n];

        System.out.println(" Random Dizimiz: ");
        for (i = 0; i < n; i++) {

            A[i] = 1 + (int) (Math.random() * 100);
            System.out.print(A[i] + " ");
        }
        g = n / 2;

        while (g >= 1) {
            do {
                durum = true;
                for (i = 0; i < n - g; i++) {
                    if (A[i] > A[i + g]) {
                        bos = A[i];
                        A[i] = A[i + g];
                        A[i + g] = bos;
                        durum = false;
                    }
                }
            } while (!durum);
            g = g / 2;
        }
        System.out.println(" ");
        System.out.println(" Sıralanmış Dizimiz: ");
        for (int b = 0; b < n; b++) {
            System.out.print(A[b] + " ");
        }
    }
}
