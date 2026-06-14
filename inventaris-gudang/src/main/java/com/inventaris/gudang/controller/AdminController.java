package com.inventaris.gudang.controller;

import com.inventaris.gudang.data.DummyData;
import com.inventaris.gudang.model.Barang;
import com.inventaris.gudang.model.Transaksi;
import com.inventaris.gudang.model.UserAkun;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        List<Barang> barangList = DummyData.getBarangList();
        List<Transaksi> transaksiList = DummyData.getTransaksiList();

        long totalBarang = barangList.size();
        long stokMenipis = barangList.stream().filter(b -> b.getStatusStok().equals("Menipis")).count();
        long masukHariIni = transaksiList.stream()
                .filter(t -> t.getTipe().equals("Masuk") && t.getTanggal().equals("2026-06-13")).count();
        long keluarHariIni = transaksiList.stream()
                .filter(t -> t.getTipe().equals("Keluar") && t.getTanggal().equals("2026-06-13")).count();

        model.addAttribute("activeMenu", "dashboard");
        model.addAttribute("role", "Admin");
        model.addAttribute("totalBarang", totalBarang);
        model.addAttribute("stokMenipis", stokMenipis);
        model.addAttribute("masukHariIni", masukHariIni);
        model.addAttribute("keluarHariIni", keluarHariIni);
        model.addAttribute("barangMenipis", barangList.stream().filter(b -> b.getStatusStok().equals("Menipis")).toList());
        model.addAttribute("riwayatTerbaru", transaksiList.subList(Math.max(0, transaksiList.size() - 5), transaksiList.size()));
        return "admin/dashboard";
    }

    @GetMapping("/data-barang")
    public String dataBarang(Model model) {
        model.addAttribute("activeMenu", "data-barang");
        model.addAttribute("role", "Admin");
        model.addAttribute("barangList", DummyData.getBarangList());
        return "admin/data-barang";
    }

    @GetMapping("/transaksi/barang-masuk")
    public String barangMasuk(Model model) {
        model.addAttribute("activeMenu", "transaksi");
        model.addAttribute("activeSubMenu", "barang-masuk");
        model.addAttribute("role", "Admin");
        model.addAttribute("barangList", DummyData.getBarangList());
        return "admin/barang-masuk";
    }

    @GetMapping("/transaksi/barang-keluar")
    public String barangKeluar(Model model) {
        model.addAttribute("activeMenu", "transaksi");
        model.addAttribute("activeSubMenu", "barang-keluar");
        model.addAttribute("role", "Admin");
        model.addAttribute("barangList", DummyData.getBarangList());
        return "admin/barang-keluar";
    }

    @GetMapping("/transaksi/riwayat")
    public String riwayatTransaksi(Model model) {
        model.addAttribute("activeMenu", "transaksi");
        model.addAttribute("activeSubMenu", "riwayat");
        model.addAttribute("role", "Admin");
        model.addAttribute("transaksiList", DummyData.getTransaksiList());
        return "admin/riwayat-transaksi";
    }

    @GetMapping("/laporan")
    public String laporan(Model model) {
        model.addAttribute("activeMenu", "laporan");
        model.addAttribute("role", "Admin");
        model.addAttribute("barangList", DummyData.getBarangList());
        model.addAttribute("transaksiList", DummyData.getTransaksiList());
        return "admin/laporan";
    }

    @GetMapping("/kelola-user")
    public String kelolaUser(Model model) {
        model.addAttribute("activeMenu", "kelola-user");
        model.addAttribute("role", "Admin");
        model.addAttribute("userList", DummyData.getUserList());
        return "admin/kelola-user";
    }
}
