/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyalama;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author akifkilic
 */
public class BufferreADER {

    public static void main(String[] args) {

        try {
            BufferedReader bf = new BufferedReader(new FileReader("dosyalama.txt"));
            String satir = null;
            int sayac = 0;

            satir = bf.readLine();
            while (satir != null) {
                sayac++;
                System.out.println("dosyalama.txt dosyasının " + sayac + " " + satir + " yazmaktadır");
                satir = bf.readLine();

            }
            bf.close();

        } catch (Exception e) {

        }
    }

}
