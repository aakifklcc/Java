/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyalama_ıo;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author akifkilic
 */
public class isREal {

    public static void main(String[] args) throws IOException {

// Mutlak adrese çevri
        Path inputPath = Paths.get("/Ad Astra/Per/Aspera/stars.txt");
         
        
//        Path r = inputPath.toAbsolutePath();
//        Path s = inputPath.toRealPath();
//        System.out.println(r);
//        System.out.println(s);

System.out.println(inputPath.resolve("bar")); // pathin sonuna ekler


    }
}
