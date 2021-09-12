/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab_homework;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;

/**
 *
 * @author akifkilic
 */
public class Soru1 {

    public static void listTest(File f) {
        File[] list = f.listFiles();
        for (int i = 0; i < list.length; i++) {
            if (list[i].isFile() && list[i].getName().endsWith(".txt")) {
                System.out.println(list[i].getName());
            }

        }
    }

    public static void main(String[] args) throws IOException {

    File f = new File("/Users/akifkilic/NetBeansProjects/BP2_Lab_Homework/Test");
    listTest(f);

    }

}
