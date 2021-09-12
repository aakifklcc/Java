/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akif_Kilic_LabQuiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author akifkilic
 */
public class Soru14 {

    public static void main(String[] args) throws FileNotFoundException {

      File f = new File("/Users/akifkilic/NetBeansProjects/Dosyalama/quiz.txt");

        String uzunKelime = "";
        String a;
        Scanner sc = new Scanner(f);

        while (sc.hasNext()) {
            a = sc.next();
            if (a.length() > uzunKelime.length()) {
                uzunKelime = a;
            }

        }
        System.out.println("\n Textdeki En Uzun Kelime : >> " + uzunKelime + " <<\n");

    }
}
