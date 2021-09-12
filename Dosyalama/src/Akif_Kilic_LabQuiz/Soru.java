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
public class Soru {

    public static void main(String[] args) {

        //içinde sesli harf olan kelimeleri yazdır.
        File f = new File("/Users/akifkilic/NetBeansProjects/Dosyalama/quiz.txt");

        try {
            Scanner scan = new Scanner(f);

            while (scan.hasNext()) {
                String a = scan.next();

                if (a.contains("a") || (a.contains("e")) || (a.contains("ı")) || (a.contains("i")) || (a.contains("o")) || (a.contains("u")) || (a.contains("ü")) || (a.contains("ö"))) {
                    System.out.println(a);

                }
//                System.out.println(scan.next());
// System.out.println(scan.findInLine("[aeıiouöü]"));
            }

        } catch (Exception e) {
            System.out.println("hata");

        }

    }

}
