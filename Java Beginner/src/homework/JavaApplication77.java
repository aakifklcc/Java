/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication77;

import java.util.Scanner;

/**
 *
 * @author akifkilic
 */
public class JavaApplication77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Kullanıcı -1 girmediği sürece kullanıcıdan 
        //  sayı alsın - 1 girdiğinde girdiği sayıları toplayıp çıktı versin

        Scanner reader = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");

        int toplam = 0;

        while (true) {
            int sayi = reader.nextInt();
            if (sayi != -1) {
                toplam += sayi;
            } else {
                break;
            }
        }

        System.out.println("Toplam: " + toplam);

    }

}
