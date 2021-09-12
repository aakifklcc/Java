/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyalama_ıo;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author akifkilic
 */
public class toAbsulate {
    public static void main(String[] args) {
             Path p = Paths.get("/Ad Astra/Per/Aspera/stars.txt");
               Path p2 = Paths.get("Ad Astra/Per/Aspera/stars.txt");
               
             System.out.println(p.getRoot());
             System.out.println(p.isAbsolute());
             System.out.println(p2.isAbsolute());
             
             
             
             
             
             //kesin olup olmadığı realpath ile belirtiliyor., absulatede de kö
    }
    
}
