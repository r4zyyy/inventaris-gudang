package com.inventaris.gudang.model;

public class Transaksi {
    private String id;
    private String tanggal;
    private String tipe; // "Masuk" atau "Keluar"
    private String kodeBarang;
    private String namaBarang;
    private int jumlah;
    private String keterangan;
    private String petugas;

    public Transaksi(String id, String tanggal, String tipe, String kodeBarang, String namaBarang,
                      int jumlah, String keterangan, String petugas) {
        this.id = id;
        this.tanggal = tanggal;
        this.tipe = tipe;
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.keterangan = keterangan;
        this.petugas = petugas;
    }

    public String getId() { return id; }
    public String getTanggal() { return tanggal; }
    public String getTipe() { return tipe; }
    public String getKodeBarang() { return kodeBarang; }
    public String getNamaBarang() { return namaBarang; }
    public int getJumlah() { return jumlah; }
    public String getKeterangan() { return keterangan; }
    public String getPetugas() { return petugas; }
}
