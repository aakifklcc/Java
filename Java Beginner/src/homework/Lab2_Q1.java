package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2_Q1 {

    public static void main(String[] args) {

        int len, p, index;
        String element;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of array: ");
        len = sc.nextInt();
        String arr[] = new String[len + 1];
        String myArray[] = new String[len + 1];
        System.out.println("Please enter" + len + " different fruits ");

        for (int i = 0; i < len; i++) {
            arr[i] = sc.next();
        }

        System.out.println("The orginal array is:" + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            myArray[i] = arr[i];
        }
        System.out.println("Please enter the index of the new element you want to add");
        index = sc.nextInt();

        System.out.print("Enter the element which you want to insert:");
        element = sc.next();

        for (int i = (len - 1); i >= (index - 1); i--) {
            myArray[i + 1] = myArray[i];
        }
        myArray[index - 1] = element;
        
        System.out.println("The new array is:" + Arrays.toString(myArray));

    }
}
