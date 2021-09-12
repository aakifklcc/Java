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
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author akifkilic
 */
public class RepeatFPAth {
    public static void main(String[] args) throws FileNotFoundException {
        
        Path dir=Paths.get("/Users/akifkilic/NetBeansProjects/BP2_Lab_Homework/Test");
        File x=new File ("/Users/akifkilic/NetBeansProjects/BP2_Lab_Homework/Test/Test1/helltxm.txt");
       
        PrintWriter dosyayayaz=new PrintWriter(x);
        
        Scanner read=new Scanner(x);
        int a= dir.getNameCount();
        String []names=new String[a];
        System.out.println(a);
                
    try(DirectoryStream<Path> stream=Files.newDirectoryStream(dir)) {
        
        while (read.hasNext()) {
            
            
        }
        
         if(!x.exists()) {
               x.createNewFile();
             
              
            } else{
             System.out.println(" Sorry my boss, we already have the this file,");
                
            }
         
        for (Path p:stream) {
//            System.out.println(p.getFileName());
           
             
            
        }
        dosyayayaz.print("alo, how can i go to taxim");
        dosyayayaz.close();
    }
        catch(IOException e) {
        
    }
    
        
    } 
}
