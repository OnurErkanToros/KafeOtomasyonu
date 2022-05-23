package com.onurerkan.models;

public class Kullanici {
    private int id;
    private String isim;
    private String soyisim;
    private String telefon;
    private String kullaniciAdi;
    private String parola;
    private boolean isAdmin;

    public Kullanici(int id, String isim, String soyisim, String telefon, String kullaniciAdi, String parola, boolean isAdmin) {
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.telefon = telefon;
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
