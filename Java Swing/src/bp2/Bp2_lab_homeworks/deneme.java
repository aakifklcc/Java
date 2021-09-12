/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab_homework;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author akifkilic
 */
public class deneme {

    public static void main(String[] args) {

        Path dir = Paths.get("/Users/akifkilic/NetBeansProjects/BP2_Lab_Homework/Test");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path file : stream) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException x) {
// IOException can never be thrown by the iteration.
// In this snippet, it can only be thrown by newDirectoryStream
        }
        
        
//
//        File f = new File("/Users/akifkilic/NetBeansProjects/BP2_Lab_Homework/Test");
//
//        Path p1 = Paths.get("/Users/akifkilic/NetBeansProjects/BP2_Lab_Homework/Test/Test1");
//
//        Path p2 = Paths.get("/Users/akifkilic/NetBeansProjects/BP2_Lab_Homework/Test/Test2");
//
//        int x = p1.compareTo(p2);
//        System.out.println(x);
//        System.out.println(p1.compareTo(p2));

//        for (Path name : path) {
//            System.out.println(name);
//        }
    }

}
