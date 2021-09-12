/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab_homework;

import java.io.File;

/**
 *
 * @author akifkilic
 */
public class deneme1 {
    //SORU İKİ DENEMESİ
    public static void listfile(File f){
       
        File [] list=f.listFiles();
        String lsitlist=" ";
        for (int i = 0; i < list.length; i++) {
            
            System.out.println(list[i].getPath());
          
        }
    }
    
    public static void main(String[] args) {
       File f =new File ("/Users/akifkilic/NetBeansProjects/BP2_Lab_Homework/Test");
        
       listfile(f);
    }
    
}
