/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyalama_ıo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author akifkilic
 */
public class LabSoru3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File f = new File("/Users/akifkilic/NetBeansProjects/Dosyalama_IO/dosya.txt");

        String[] s = new String [10];
        
         FileReader fr = new FileReader(f);
         BufferedReader br = new BufferedReader(fr);

       
         int sayac=0;
         
         
//         while((s=br.readLine())!=null) {
//             
//             Path p=Paths.get(s);
//             
//             
 
        
//         }

    }

}
