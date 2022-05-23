package com.onurerkan.models;

public class Kategori {
    private int id;
    private String kategori;

    public Kategori(int id, String kategori) {
        this.id = id;
        this.kategori = kategori;
    }

    public int getId() {
        return id;
    }

    public String getKategori() {
        return kategori;
    }
}
