/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyalama;

import java.io.File;
import java.io.PrintStream;

/**
 *
 * @author akifkilic
 */
public class writeinfile {
    public static void main(String[] args) {
        
//        File f=new File("/Users/akifkilic/NetBeansProjects/Dosyalama/dosyalama.txt");
//        PrintStream writer=new PrintStream(f);
//these both of 18 & 19 lines mean same the line 23 //call address or file name

         try {
             
        PrintStream writer=new PrintStream( new File ("dosyalama.txt"));
        
         for (int i = 0; i < 9; i++) {
             
             int a=(int)(Math.random()*100);
                   writer.println(i+".: "+a); //deleting anything & wrting this
             }
             
      
        writer.close();
         }
         catch (Exception e){
             System.out.println("there is a mistake");
             
            
         }
        
        
    }
    
}
