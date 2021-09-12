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
public class Dosyalama_IO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//            File f = new File("/Users/akifkilic/NetBeansProjects/Dosyalama/quiz.txt");
//        Path path = Paths.get("/Users/akifkilic/NetBeansProjects/Dosyalama/quiz.txt");
//        System.out.println("get name: %s%n :"+ path.getNameCount());
//        System.out.println(path.getRoot());
//        System.out.println(path.getFileName());

        Path path1 = Paths.get("/Ad Astra/Per/Aspera/stars.txt");
        for (int i = 0; i < path1.getNameCount(); i++) {
            System.out.println(path1.getName(i));

        }

    }

}
