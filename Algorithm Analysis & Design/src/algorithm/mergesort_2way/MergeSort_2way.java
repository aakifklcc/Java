import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MergeSort_2way {

    private int[] list;

    public static void main(String[] args) {

        final int SIZE = 4000000;
        final int SEED = 10;
        long stopTime, startTime;
        int[] arrayToSort = new int[SIZE];

        Random random1 = new Random();
        random1.setSeed(SEED);
  
      
        for (int i = 0; i < SIZE; i++) {
            arrayToSort[i] = random1.nextInt();
            //System.out.println(i + ". eleman :" + arrayToSort[i]);
        }
           //Arrays.sort(arrayToSort); //Increasing
          // Arrays.sort(arrayToSort, Collections.reverseOrder()); // Decreasing
           
              System.out.println("Start sorting ...");
        startTime = System.currentTimeMillis();
        System.out.println("Start Time: " + startTime);
        
          MergeSort_2way  sortObj = new MergeSort_2way (arrayToSort);
            sortObj.sort();
            
            
            stopTime = System.currentTimeMillis();
            long elapsedTime = stopTime - startTime;
            System.out.println("Stop Time: " + stopTime);
            System.out.println("runningtime: "+elapsedTime);
/*
        System.out.print("Unsorted:");
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }

        MergeSort sortObj = new MergeSort(arrayToSort);
        sortObj.sort();

        System.out.print("\nSorted:");
        int[] sirali = sortObj.getList();

        for (int i = 0; i < sirali.length; i++) {
            System.out.print(sirali[i] + " ");
        }*/


    }

    // siralancak listeyi alan inşa fonksiyonu
    public MergeSort_2way(int[] listToSort) {
        list = listToSort;
    }

    // listeyi döndüren kapsülleme fonksiyonu
    public int[] getList() {
        return list;
    }

    // dışarıdan çağırılan sıralama fonksiyonu
    public void sort() {
        list = sort(list);
    }

    // Özyineli olarak çalışan ve her parça için kullanılan sıralama fonksiyonu
    private int[] sort(int[] whole) {
        if (whole.length == 1) {
            return whole;
        } else {
            // diziyi ikiye bölüyoruz ve solu oluşturuyoruz
            int[] left = new int[whole.length / 2];
            System.arraycopy(whole, 0, left, 0, left.length);

            //dizinin sağını oluşturuyoruz ancak tek sayı ihtimali var
            int[] right = new int[whole.length - left.length];
            System.arraycopy(whole, left.length, right, 0, right.length);

            // her iki tarafı ayrı ayrı sıralıyoruz
            left = sort(left);
            right = sort(right);

            // Sıralanmış dizileri birleştiriyoruz
            merge(left, right, whole);

            return whole;
        }
    }

    // birleştirme fonksiyonu
    private void merge(int[] left, int[] right, int[] result) {
        int x = 0;
        int y = 0;
        int k = 0;

        // iki dizide de eleman varken
        while (x < left.length && y < right.length) {
            if (left[x] < right[y]) {
                result[k] = left[x];
                x++;
            } else {
                result[k] = right[y];
                y++;
            }
            k++;
        }

        int[] rest;
        int restIndex;
        if (x >= left.length) {
            rest = right;
            restIndex = y;
        } else {
            rest = left;
            restIndex = x;
        }

        for (int i = restIndex; i < rest.length; i++) {
            result[k] = rest[i];
            k++;
        }
    }


}