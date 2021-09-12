/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyalama_ıo;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.Path;

/**
 *
 * @author akifkilic
 */
public class NewClass {

public static void listTest(File dir){
    File[] list=dir.listFiles();       
    for(int i=0;i<list.length;i++){
      System.out.println(list[i].getName());
    } 
  }
  public static void filterTest(File folder){
    FileFilter filter=new FileFilter(){
      public boolean accept(File file){
        return file.isFile();
      }           
    };
    
//    File[] normals=folder.listFiles(filter);
//    for(int i=0;i<normals.length;i++){
//      System.out.println(normals[i].getName());
//    }
  }
  public static void main(String[] args){
    File dir=new File("/Users/akifkilic/NetBeansProjects/bp2_lab_homework/Test");    
    listTest(dir);
    filterTest(dir);     
  }
  
  
  //        if(!f.exists()) {
//            f.createNewFile();
//         
//        } else{
//            f.delete();
//            System.out.println(f.getName()+"dosyası başarıyla silindi");
//        }
  
  
  
  
//        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(".{txt}");
        
//        Path path = Paths.get(f.toPath().toString());
//        System.out.println(path);
//
//        for (int i = 0; i < path.getNameCount(); i++) {
//
//            System.out.println(path.getName(i));
//        }

//        if (matcher.matches(path)) {
//
//            System.out.println(path);
//        }
  
}