/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab_homework;

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
public class Soru_1 {

    public static void main(String[] args) {
        Path dir = Paths.get("/Users/akifkilic/NetBeansProjects/BP2_Lab_Homework/Test");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.{txt}")) {
            for (Path entry : stream) {
                String s=entry.getFileName().toString();
                
                System.out.println(s);

            }
        } catch (IOException | DirectoryIteratorException x) {
            System.err.println(x);
        }
    }

}
