/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Arrays;
import java.util.Scanner;

public class lab2 {

    public static void main(String[] args) {
// dizide eğer çift bir sayı iki tek sayı arsında ise onu üçünün toplamının 
//5 fazlasının ikiye bölümü ile değiştirme
        int length, element;
        int sayac = 5;

        Scanner s = new Scanner(System.in);
        System.out.println("lğtfen dizinin boyunu giriniz");
        length = s.nextInt();
        int arr[] = new int[15];
        int arr2[] = new int[length];
        System.out.println("çift tek sayı girme");

        if (length > 15) {
            for (int i = 0; i < length; i++) {
                element = s.nextInt();
                if (sayac > 0 && sayac <= 5) {
                    arr[i] = element;
                    sayac--;
                }
            }
            System.out.println("The orginal array of first 15 elemnt:" + Arrays.toString(arr));
            for (int j = 0; j < 10; j++) {

            }

        } else {
            for (int i = 0; i < length; i++) {
                element = s.nextInt();
                arr2[i] = element;
            }
            System.out.println("The original array is under 15:" + Arrays.toString(arr2));

            for (int j = 0; j < length; j++) {
                int a = arr2[j+1];
                int b = arr2[j];
                int c = arr2[j + 2];
                if ((a % 2 == 0)&&(b%2==1)&&(c%2==1)) {
                    a= (a + b + c + 5)/ 2;
                  
                }
             System.out.println ("noluyo"+arr2[j]);
            }System.out.println("The edited array is under 15:" + Arrays.toString(arr2));
            
        }

    }

}
