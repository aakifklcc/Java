package sortingAlgorithms;

/**
 *
 * @author akifkilic
 */
import java.util.*;

public class quick_Sort {
    // 'N' 'C' 'A' 'R' 'E' K' O B string türdeki diziyi quick sort ile artan sekilde sıralama

    static void sorting(char dizi[]) {
        beginend(dizi, 0, dizi.length - 1);
    }

    public static void beginend(char dizi[], int left, int right) {

        int i, j;
        char orta, bos;
        i = left;
        j = right;
        orta = dizi[(left + right) / 2];
        do {
            while ((dizi[i] < orta) && (i < right)) {
                i++;
            }
            while ((orta < dizi[j]) && (j > left)) {
                j--;
            }
            if (i <= j) {
                bos = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = bos;
                i++;
                j--;

            }
        } while (i <= j);

        if (left < j) {
            beginend(dizi, left, j);
        }
        if (i < right) {
            beginend(dizi, i, right);
        }

    }

    public static void main(String[] args) {
        char a[] = {'N', 'C', 'A', 'R', 'E', 'K', 'O', 'B'};

        System.out.println("Unsorted Array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        sorting(a);
        System.out.println("Sorted Array:");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }

    }

}
