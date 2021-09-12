/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyalama;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author akifkilic
 */
public class dosyalama {

    public static void main(String[] args) throws IOException {

        File f = new File("/Users/akifkilic/NetBeansProjects/Dosyalama/dosyalama.txt");
        int sum = 0;
        int sayac = 0;

        Scanner scanner = new Scanner(f);
        try {

            while (scanner.hasNext()) {
                sayac++;
                sum += scanner.nextInt();
//                dizi[sayac]=scanner.int;
            }
            System.out.println("sum: " + sum);
            System.out.println("sayac: " + sayac);
           
        } catch (Exception e) {
            System.out.println("hata");

        }

    }
}
