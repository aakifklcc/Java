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
public class LabSoru2 {
    
    public static void main(String[] args) {
        
 /* Path path= Paths.get ("a","b","c"); is it absolute, if not make it absolute*/
        
     
        Path p = Paths.get("a","b","c");
       
        System.out.println("is it Absolute: "+p.isAbsolute());
         Path r = p.toAbsolutePath();
         System.out.println(r);
         System.out.println("Now it's : "+r.isAbsolute());
         
//         System.out.println(r);
//        Path s = r.toRealPath();


        
     
        
        
    }
    
    
    
    
    
 


    
    
}
