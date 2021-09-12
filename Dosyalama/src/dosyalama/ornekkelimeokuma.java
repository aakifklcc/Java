/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyalama;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author akifkilic
 */
public class ornekkelimeokuma {

    public static void main(String[] args) {

        File f = new File("/Users/akifkilic/NetBeansProjects/Dosyalama/dosyalama.txt");

        try {
            Scanner s = new Scanner(f);
            String dosyaIcerigi = s.useDelimiter("\\A").next(); //W:split görevi görüyor
            // useDelimiter özel karakterlere göre ayırıyor.
            // ("\\A") şuraya string veri de yazabiliriz mesela akif yazrsan tüm akifleri arar
            System.out.println(dosyaIcerigi);
            s.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
