package district;

import java.util.Scanner;

/**
 *
 * @author akifkilic
 */

/* 
     Discrete Structures: CASE STUDY_LAB Question_2:
    - let U={x elemanıdır N I x<20} 
    - Prompt the user to enter the elements of two sets, A C U and B C U,
    - Use arrays to create two sets and perform the following operations
    _ union of sets:
    _intersection of sets
    _difference of sets
    _complement of sets
   
    *>alınan elemanlar 20 den küçük olacak ve evrensel kümeye eşit olmamamlı
    *>a ve b u ya eşit olmamalı 
 */
public class Akif_Kilic_HW2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of ListA: ");
        int sizeOfListA = input.nextInt();
        int[] listA = new int[sizeOfListA];
        System.out.println("Enter numbers (0<=number) && (number <20)");
        for (int i = 0; i < listA.length; i++) {
            int number = input.nextInt();
            if (0 <= number && number < 20) {

                listA[i] = number;
            } else {
                System.out.println("invalid input, please try again");
                i--;
            }
        }
        // cmd shift R tüm değişkeni aynı yerde değiştirir.

        System.out.println("Enter size of ListB: ");
        int sizeOfListB = input.nextInt();
        int[] listB = new int[sizeOfListB];
        System.out.println("Enter numbers (0<=number) && (number <20)");
        for (int i = 0; i < listB.length; i++) {
            int number = input.nextInt();
            if (0 <= number && number < 20) {
                listB[i] = number;

            } else {
                System.out.println("invalid input, please try again");
                i--;
            }
        }
        int[]union=union(listA, listB);
        // for checking union
        for (int i=0; i<union.length;i++) {
            System.out.print(union[i]+ " ");
        }
        System.out.println("-------------------");
        
        
        int[]intersection=intersection(listA, listB);
        // for checking union
        
        for (int i=0; i<intersection.length;i++) {
            System.out.print(intersection[i]+ " ");
        }

    }

    public static int[] union(int[] A, int[] B) {
        boolean[] universal = new boolean[20];
        for (int i = 0; i < A.length; i++) {
            universal[A[i]] = true;
        }
        for (int i = 0; i < B.length; i++) {
            universal[B[i]] = true;
        }int count=0;
        
        for (boolean b : universal) {
            if(b){
                count++;
            }
        }
        int union[] = new int[count];
        int index=0;
        for (int i = 0; i < universal.length; i++) {
            if(universal[i]==true)
            union[index++]=i;
        }
        return  union;
    }
    
    
    public static int[] intersection(int[] A, int[] B) {
        int[] universal = new int[20];
        for (int i = 0; i < A.length; i++) {
            universal[A[i]] ++;
        }
        for (int i = 0; i < B.length; i++) {
            universal[B[i]] ++;
        }
        int count=0;
        
        for (int b : universal) {
            if(b==2){
                count++;
            }
        }
        int intersection[] = new int[count];
        int index=0;
        for (int i = 0; i < universal.length; i++) {
        if(universal[i]>1){
            intersection[index++]=i;
        }
        }
        return  intersection
            ;    }
}


