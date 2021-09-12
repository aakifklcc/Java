/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab_homework;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author akifkilic
 */
public class repetetiation {
    
    
    public static void listFile (File f) {
        
        File []list=f.listFiles();
        
        Scanner s=new Scanner(System.in);
        
        String []a=new String [list.length];
        
        
        for (int i = 0; i < list.length; i++) {
            
            System.out.println(list[i].getName());
            
          a [i]=list[i].getPath().toString();
            System.out.println(a[i]);
            
            
        }
        
        
        
        
    }
    
    
    public static void main(String[] args) {
        File f=new File ("/Users/akifkilic/NetBeansProjects/BP2_Lab_Homework/Test");
        listFile(f);
    }
    
}
