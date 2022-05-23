package com.onurerkan.models;

public class Masa {
    private int id;
    private String masaIsim;
    private Adisyon adisyon;

    public Masa(int id, String masaIsim, Adisyon adisyon) {
        this.id = id;
        this.masaIsim = masaIsim;
        this.adisyon = adisyon;
    }

    public int getId() {
        return id;
    }

    public String getMasaIsim() {
        return masaIsim;
    }

    public Adisyon getAdisyon() {
        return adisyon;
    }
}
