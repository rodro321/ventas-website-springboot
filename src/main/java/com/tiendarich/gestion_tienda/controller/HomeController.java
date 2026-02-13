package com.tiendarich.gestion_tienda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<h1>¡El Backend de Rich Funciona! 🚀</h1><p>Conexión a BD PostgreSQL exitosa.</p>";
    }
}