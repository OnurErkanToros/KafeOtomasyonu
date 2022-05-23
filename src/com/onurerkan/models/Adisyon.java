package com.onurerkan.models;


import java.util.ArrayList;

public class Adisyon {
    private int id;
    ArrayList<Siparis> siparisler;

    public Adisyon(int id, ArrayList<Siparis> siparisler) {
        this.id = id;
        this.siparisler = siparisler;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Siparis> getSiparisler() {
        return siparisler;
    }
}
