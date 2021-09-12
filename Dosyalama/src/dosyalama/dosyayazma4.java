/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyalama;

import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author akifkilic
 */
public class dosyayazma4 {

    public static void main(String[] args) {

        try {
            File f = new File("/Users/akifkilic/NetBeansProjects/Dosyalama/dosya.txt");
            FileOutputStream fos = new FileOutputStream("dosya.txt");
            String yazi = "Bu satir dosyaya yazilacak\naltina da bu satir yazilacak.";
            fos.write(yazi.getBytes());
            fos.flush();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
