package com.onurerkan.manager;

import com.onurerkan.models.Kategori;
import com.onurerkan.models.Urun;

import java.util.ArrayList;

public class UrunManager {

    public ArrayList<Urun> getUrunler(){
        ArrayList<Urun> urunler = new ArrayList<>();
        urunler.add(new Urun(1,"Çay",7,5,new Kategori(1,"Sıcaklar")));
        urunler.add(new Urun(2,"Kahve",15,5,new Kategori(1,"Sıcaklar")));
        urunler.add(new Urun(3,"Ihlamur",10.5,5,new Kategori(1,"Sıcaklar")));
        return urunler;
    }

}
