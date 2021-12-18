/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasta_takip;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;

/**
 *
 * @author oğuz
 */
public class Doktor {
    static ArrayList <Doktor> doktors=new ArrayList<>();
    

    Doktor(){
        
        //doktors.add(this);
    }
    Doktor(String ad,String soy,String pass,int id,String alan){
        this.ad=ad;
        this.id=id;
        this.password=pass;
        this.soyad=soy;
        doktors.add(this);
        this.alan=alan;
    }
    public ArrayList <Rapor> gelenRaporlar=new ArrayList<>();
    public ArrayList<Recete> gonderdiğimReceteler=new ArrayList<>();
    public ArrayList<Rapor> cevapladigimRaporlar=new ArrayList<>();
    String ad,soyad,password,alan;
    int id;
    
}
