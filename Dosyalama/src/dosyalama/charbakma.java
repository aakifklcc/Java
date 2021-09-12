/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyalama;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author akifkilic
 */
public class charbakma {

    public static void main(String[] args) {

        try {
            File f = new File("/Users/akifkilic/NetBeansProjects/Dosyalama/dosya.txt");
            if (!f.exists()) {
                f.createNewFile();
            }
                FileInputStream fis = new FileInputStream("dosya.txt");
                int ch = 0;
                while (ch != -1) {
                    ch = fis.read();
                    char karakter = (char) ch;
                    System.out.print(karakter);
                }
                fis.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
