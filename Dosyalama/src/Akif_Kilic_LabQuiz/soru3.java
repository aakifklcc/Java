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
public class soru3 {

    public static void main(String[] args) {

        File f = new File("/Users/akifkilic/NetBeansProjects/Dosyalama/quiz.txt");
        File f1 = new File("/Users/akifkilic/NetBeansProjects/Dosyalama/quiz2.txt");

        try {

            Scanner scan2 = new Scanner(f);
            Scanner scan = new Scanner(f1);
            String a;
            String b;
            
            int x= (int) f.length();
            int y= (int) f1.length();
            int c;
            boolean xx;
            
            if(x>y) {
                c=x;
            } else {
                c=y;
            }
             
            for (int i = 0; i < c; i++) {
                  a = scan.next();
                  b = scan2.next();
                
                  
//                   xx=a.contentEquals(b);
                   if (a.contentEquals(b)) {
                    System.out.println("İçrikler aynıdır");

                } else {
                    System.out.println("İçerikler Farklıdır");

                }
                  
            }
//             if(xx=true) {
//                       System.out.println("içerikler aynı");
//                   } else {
//                       System.out.println("içeirkler farklı");
//                   }
                
             
            

//            while ((scan2.hasNext()) && (scan2.hasNext())) {
//
//                a = scan.nextLine();
//                b = scan2.nextLine();
//
//                if (a.contentEquals(b)) {
//                    System.out.println(" İçrikler aynıdır");
//
//                } else {
//                    System.out.println("İçerikler Farklıdır");
//
//                }
//
//            }

        } catch (Exception e) {
            System.out.println("hata");

        }
    }

}
