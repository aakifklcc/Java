/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akif_Kilic_LabQuiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author akifkilic
 */
public class ornekdizi {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
           File f = new File("/Users/akifkilic/NetBeansProjects/Dosyalama/quiz.txt");
        
        //dosya ve stream olustur

FileInputStream girisStream = new FileInputStream(f);
//verileri okumak icin bir dizi olustur
int dosyaBoyutu = (int)f.length();
byte[]byteDizisi = new byte[dosyaBoyutu];

//veriyi oku ve goster
girisStream.read(byteDizisi);

for(int i = 0; i < dosyaBoyutu; i++) {
System.out.println(byteDizisi[i]);
}
//okuma bitti stream’I kapat
girisStream.close();
        
    }
    
}
