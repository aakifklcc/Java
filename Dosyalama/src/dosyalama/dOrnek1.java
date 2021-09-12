/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyalama;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author akifkilic
 */
public class dOrnek1 {
    public static void main(String[] args) throws FileNotFoundException {
        
        // find that how many words in A given directory
        
        
        File f = new File("/Users/akifkilic/NetBeansProjects/Dosyalama/dosyalama.txt");
        int sum = 0;
        int sayac = 0;
        char []a;
        String []words=null;
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
       String s;
        
//        şanı şerh ola      
//        Scanner scanner = new Scanner(new file(dosyalama.txt).useDelimiter("\\W"));
        
        
//       try {
//
//            while ((s=br.readLine()!=null) {
//               words=s.split(" ");
//               sum=sum+words.length;
//            }
//            fr.close();
//            System.out.println("number of word" + sum);
//           
//           
//        } catch (Exception e) {
//            System.out.println("hata");
//
//        }

    }
}
        
        
        
        

