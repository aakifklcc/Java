/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyalama_ıo;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author akifkilic
 */
public class Labsoru1 {

    public static void main(String[] args) {

//        File f = new File("/Users/akifkilic/NetBeansProjects/Dosyalama/quiz.txt");

        Path p = Paths.get("/Users/akifkilic/NetBeansProjects/Dosyalama/quiz.txt");
        System.out.println(p.getNameCount());
        
        for (int i = 0; i < p.getNameCount(); i++) {

            System.out.println(p.getName(i));
         
        }

//        
//        System.out.println(p.getNameCount());
//        System.out.println(p.getRoot());
//        System.out.println(p.getName(i));
//        System.out.println(p.getFileName());


    }
    
    

}
