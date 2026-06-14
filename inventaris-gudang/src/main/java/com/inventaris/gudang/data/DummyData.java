package com.inventaris.gudang.data;

import com.inventaris.gudang.model.Barang;
import com.inventaris.gudang.model.Transaksi;
import com.inventaris.gudang.model.UserAkun;

import java.util.ArrayList;
import java.util.List;

/**
 * Penyimpanan data dummy (in-memory) untuk keperluan tampilan frontend.
 * Belum terhubung ke database — hanya untuk simulasi UI.
 */
public class DummyData {

    public static List<Barang> getBarangList() {
        List<Barang> list = new ArrayList<>();
        list.add(new Barang("BRG001", "Kabel Listrik NYM 2x1.5mm", "Elektrikal", "Roll", 25, 10));
        list.add(new Barang("BRG002", "Lampu LED 12 Watt", "Elektrikal", "Pcs", 8, 15));
        list.add(new Barang("BRG003", "Pipa PVC 1/2 Inch", "Plumbing", "Batang", 40, 20));
        list.add(new Barang("BRG004", "Cat Tembok Putih 5kg", "Material", "Kaleng", 12, 5));
        list.add(new Barang("BRG005", "Semen 40kg", "Material", "Sak", 5, 10));
        list.add(new Barang("BRG006", "Sarung Tangan Safety", "K3", "Pasang", 30, 10));
        list.add(new Barang("BRG007", "Baut 10mm", "Hardware", "Box", 18, 8));
        list.add(new Barang("BRG008", "Helm Proyek", "K3", "Pcs", 3, 5));
        return list;
    }

    public static List<Transaksi> getTransaksiList() {
        List<Transaksi> list = new ArrayList<>();
        list.add(new Transaksi("TRX001", "2026-06-10", "Masuk", "BRG001", "Kabel Listrik NYM 2x1.5mm", 10, "Pembelian baru dari supplier", "Admin"));
        list.add(new Transaksi("TRX002", "2026-06-11", "Keluar", "BRG003", "Pipa PVC 1/2 Inch", 5, "Proyek renovasi gedung A", "Petugas Gudang"));
        list.add(new Transaksi("TRX003", "2026-06-12", "Masuk", "BRG004", "Cat Tembok Putih 5kg", 6, "Restock bulanan", "Petugas Gudang"));
        list.add(new Transaksi("TRX004", "2026-06-12", "Keluar", "BRG002", "Lampu LED 12 Watt", 12, "Permintaan divisi maintenance", "Petugas Gudang"));
        list.add(new Transaksi("TRX005", "2026-06-13", "Keluar", "BRG005", "Semen 40kg", 8, "Proyek renovasi gedung B", "Admin"));
        list.add(new Transaksi("TRX006", "2026-06-13", "Masuk", "BRG008", "Helm Proyek", 2, "Tambahan stok K3", "Admin"));
        return list;
    }

    public static List<UserAkun> getUserList() {
        List<UserAkun> list = new ArrayList<>();
        list.add(new UserAkun("USR001", "Andi Saputra", "andi.admin", "Admin", "Aktif"));
        list.add(new UserAkun("USR002", "Budi Santoso", "budi.petugas", "Petugas Gudang", "Aktif"));
        list.add(new UserAkun("USR003", "Citra Lestari", "citra.petugas", "Petugas Gudang", "Aktif"));
        list.add(new UserAkun("USR004", "Dewi Anggraini", "dewi.admin", "Admin", "Nonaktif"));
        return list;
    }
}
