/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasta_takip;

import java.util.ArrayList;

/**
 *
 * @author oğuz
 */
public class Hasta {
    static ArrayList<Hasta> hastalar=new ArrayList<>();
     ArrayList<Rapor> gonderilenRapor=new ArrayList<>();
     ArrayList<Recete> gelenRecete=new ArrayList<>();
    int id;
    String ad,soyad,pass;
    
    Hasta(String ad,String soy,String pass,int id){
        this.ad=ad;
        this.soyad=soy;
        this.pass=pass;
        this.id=id;
        hastalar.add(this);
    }
    Hasta(){
        
    }
}
