/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab_homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author akifkilic
 */
public class Soru_4 {
    
    public static void listTest(File f) throws FileNotFoundException {

        File file = new File("/Users/akifkilic/NetBeansProjects/BP2_Lab_Homework/Test/writenames.txt");
        File[] list = f.listFiles();
        String[] filename = new String[list.length];
        PrintWriter dosyayaz = new PrintWriter(file); //yazcağımız dosyayı  oluşturduk ve belirledk

        for (int i = 0; i < list.length; i++) {

            if (list[i].isFile()) { // System.out.println(list[i].getName // dosyaları listeledik

                filename[i] = list[i].getName(); // dosya isimlerini string dizimize aldık
                dosyayaz.println(filename[i]);  // Ve yazdırdık..

            }

        }
        dosyayaz.close();
   }

    public static void main(String[] args) throws IOException {

        File f = new File("/Users/akifkilic/NetBeansProjects/BP2_Lab_Homework/Test");
        listTest(f);
    
}
}