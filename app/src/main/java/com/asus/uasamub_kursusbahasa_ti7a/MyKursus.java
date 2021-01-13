package com.asus.uasamub_kursusbahasa_ti7a;

public class MyKursus {

    String nama_kursus, lokasi;
    String jumlah_kursus;

    public MyKursus() {
    }

    public MyKursus(String nama_kursus, String lokasi, String jumlah_kursus) {
        this.nama_kursus = nama_kursus;
        this.lokasi = lokasi;
        this.jumlah_kursus = jumlah_kursus;
    }

    public String getNama_kursus() {
        return nama_kursus;
    }

    public void setNama_kursus(String nama_kursus) {
        this.nama_kursus = nama_kursus;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getJumlah_kursus() {
        return jumlah_kursus;
    }

    public void setJumlah_kursus(String jumlah_kursus) {
        this.jumlah_kursus = jumlah_kursus;
    }
}
