/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab_homework;

import java.io.File;

/**
 *
 * @author akifkilic
 */
public class Soru2 {
    
    public static void listfile(File f){
       
        File [] list=f.listFiles();
        String lsitlist=" ";
        for (int i = 0; i < list.length; i++) {
            
            System.out.println(list[i].getPath());
          
        }
    }
    
    public static void main(String[] args) {
       File f =new File ("/Users/akifkilic/NetBeansProjects/BP2_Lab_Homework/Test");
       
       listfile(f);
       
       
//       Path p1 = ...;
//Path p2 = ...;
//
//if (Files.isSameFile(p1, p2)) {
//    // Logic when the paths locate the same file
//}

    }
  /* *************************************************  
    
//    public class Sort implements Comparator<File> {
//
//    @Override
//    public int compare(File n1, File n2){
//        return n1.getName().compareTo(n2.getName);
//    }    
//
//}
    
    final File file = new File(System.getProperty(dir));
final File[] files = file.listFiles();
Arrays.sort(files, new Sort());
for(final File f : files) {
    //do something with f
}
    
    
    */
}
