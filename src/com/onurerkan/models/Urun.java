package com.onurerkan.models;

public class Urun {
    private int id;
    private String urunAdi;
    private double birimFiyat;
    private int stok;
    private Kategori kategori;

    public Urun(int id, String urunAdi, double birimFiyat, int stok, Kategori kategori) {
        this.id = id;
        this.urunAdi = urunAdi;
        this.birimFiyat = birimFiyat;
        this.stok = stok;
        this.kategori = kategori;
    }

    public int getId() {
        return id;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public int getStok() {
        return stok;
    }

    public String getKategori() {
        return kategori.getKategori();
    }
}
