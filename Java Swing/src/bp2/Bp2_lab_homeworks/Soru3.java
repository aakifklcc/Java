/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab_homework;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import static java.nio.file.Files.move;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

/**
 *
 * @author akifkilic
 */
public class Soru3 {

    public static void listTest(File f) throws IOException {
        File[] list = f.listFiles();
        for (int i = 0; i < list.length; i++) {
            //a şıkkı için: List(i) elemanımız file ise ve lengthi 8 den büyükse listeleyecek
            if (list[i].length() > 8 && list[i].isFile()) {
                System.out.println(list[i].getName());

            }
        }
        for (int j = 0; j < list.length; j++) {
            //b şıkkı için: List(i) elemanımız file ise ve lengthi 8 den büyükse taşıma yapacağız
            if (list[j].length() > 8 && list[j].isFile()) {

                Path p4; 
                p4 = list[j].toPath();  // pdf dosyamızın pathini aldık
                System.out.println("ilkin p4:" + p4);
                
                Path p2 = Paths.get("/Users/akifkilic/NetBeansProjects/BP2_Lab_Homework/Test/Test2");
                Files.copy(p4, p2, REPLACE_EXISTING); // copy yerine move yazarak taşıyabiliriz
                System.out.println("şimdi p4"+p4);

            }

        }

    }

    public static void main(String[] args) throws IOException {

        File f = new File("/Users/akifkilic/NetBeansProjects/BP2_Lab_Homework/Test");
        
        listTest(f);

    }

}
