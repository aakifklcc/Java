/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akif_Kilic_LabQuiz;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author akifkilic
 */
public class soru2 {

    public static void main(String[] args) {
        
        File f = new File("/Users/akifkilic/NetBeansProjects/Dosyalama/quiz.txt");

        try {

            Scanner scan = new Scanner(f);

            int byt = (int) (f.length());
            String a;
            
            int[] deger = new int[byt];
            String[] word = new String[byt];

            int sayac;
//            System.out.println(byt); //28 karakter

            while (scan.hasNext()) {

                a = scan.nextLine();

                System.out.println(a);

            }

        } catch (Exception e) {
            System.out.println("hata");

        }
    }

}
