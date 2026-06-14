package com.inventaris.gudang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    @GetMapping("/")
    public String index() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam(required = false) String username,
                           @RequestParam(required = false) String role,
                           Model model) {
        // Simulasi login berbasis role (belum ada autentikasi nyata - hanya frontend)
        if ("Admin".equalsIgnoreCase(role)) {
            return "redirect:/admin/dashboard";
        } else if ("Petugas".equalsIgnoreCase(role)) {
            return "redirect:/petugas/dashboard";
        }
        model.addAttribute("error", "Silakan pilih role untuk masuk.");
        return "auth/login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }
}
