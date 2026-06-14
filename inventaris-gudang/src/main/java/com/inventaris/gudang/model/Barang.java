package com.inventaris.gudang.model;

public class Barang {
    private String kode;
    private String nama;
    private String kategori;
    private String satuan;
    private int stokSaatIni;
    private int minimumStok;

    public Barang(String kode, String nama, String kategori, String satuan, int stokSaatIni, int minimumStok) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
        this.satuan = satuan;
        this.stokSaatIni = stokSaatIni;
        this.minimumStok = minimumStok;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public String getKategori() { return kategori; }
    public String getSatuan() { return satuan; }
    public int getStokSaatIni() { return stokSaatIni; }
    public int getMinimumStok() { return minimumStok; }

    public String getStatusStok() {
        return stokSaatIni <= minimumStok ? "Menipis" : "Normal";
    }
}
