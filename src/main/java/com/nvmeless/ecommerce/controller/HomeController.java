package com.nvmeless.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/") // Ruta base
public class HomeController {

    // --- RUTAS PRINCIPALES ---

    // Cuando el usuario entra a localhost:8080/
    @GetMapping("")
    public String home() {
        return "home"; // Carga templates/home.html
    }

    // Cuando el usuario entra a localhost:8080/productos
    @GetMapping("/productos")
    public String catalogo() {
        return "productos"; // Carga templates/productos.html
    }

    // --- RUTAS DE DETALLE DE PRODUCTOS ---
    // Estas rutas permiten que los botones "Ver Detalle" funcionen

    @GetMapping("/producto-poleron")
    public String verPoleron() {
        return "producto-poleron"; // Carga templates/producto-poleron.html
    }

    @GetMapping("/producto-falda")
    public String verFalda() {
        return "producto-falda"; // Carga templates/producto-falda.html
    }

    @GetMapping("/producto-botas")
    public String verBotas() {
        return "producto-botas"; // Carga templates/producto-botas.html
    }

    @GetMapping("/producto-polera")
    public String verPolera() {
        return "producto-polera"; // Carga templates/producto-polera.html
    }

    @GetMapping("/producto-chaqueta")
    public String verChaqueta() {
        return "producto-chaqueta"; // Carga templates/producto-chaqueta.html
    }

    @GetMapping("/producto-accesorio")
    public String verAccesorio() {
        return "producto-accesorio"; // Carga templates/producto-accesorio.html
    }

    @GetMapping("/producto-mochila")
    public String verMochila() {
        return "producto-mochila"; // Carga templates/producto-mochila.html
    }
}