/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasta_takip;

import java.util.ArrayList;

public class Rapor extends Hasta_Takip{
    //public   ArrayList <Rapor> gönderilenRaporlar=new ArrayList();
    static int lastId=0;
    int raporId;
    boolean cevaplandimi;
    String baslik,aciklama;
    Doktor d;
    Hasta GonderenHasta ;
    
    
    Rapor(String baslik,String aciklama,Doktor doktor,Hasta gönderenHasta){
        this.baslik=baslik;
        this.aciklama=aciklama;
        this.d=doktor;
        this.GonderenHasta=gönderenHasta;
        gönderenHasta.gonderilenRapor.add(this);
        this.raporId=lastId+1;
        lastId=this.raporId;
    }
    
}
