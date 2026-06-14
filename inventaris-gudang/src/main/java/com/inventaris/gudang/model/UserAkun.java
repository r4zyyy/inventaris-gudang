package com.inventaris.gudang.model;

public class UserAkun {
    private String id;
    private String nama;
    private String username;
    private String role; // "Admin" atau "Petugas Gudang"
    private String status; // "Aktif" / "Nonaktif"

    public UserAkun(String id, String nama, String username, String role, String status) {
        this.id = id;
        this.nama = nama;
        this.username = username;
        this.role = role;
        this.status = status;
    }

    public String getId() { return id; }
    public String getNama() { return nama; }
    public String getUsername() { return username; }
    public String getRole() { return role; }
    public String getStatus() { return status; }
}
