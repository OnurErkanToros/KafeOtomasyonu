package com.onurerkan.models;

public class Siparis {
    private int id;
    private Urun urun;
    private int urunMiktar;
    private Adisyon adisyon;

    public Siparis(int id, Urun urun, int urunMiktar, Adisyon adisyon) {
        this.id = id;
        this.urun = urun;
        this.urunMiktar = urunMiktar;
        this.adisyon = adisyon;
    }

    public int getId() {
        return id;
    }

    public Urun getUrun() {
        return urun;
    }

    public int getUrunMiktar() {
        return urunMiktar;
    }

    public Adisyon getAdisyon() {
        return adisyon;
    }
}
