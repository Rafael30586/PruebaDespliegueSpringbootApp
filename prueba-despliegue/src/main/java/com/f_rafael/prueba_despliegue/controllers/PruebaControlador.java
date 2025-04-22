package com.f_rafael.prueba_despliegue.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PruebaControlador {

    @GetMapping("/saludo")
    public String saludar(){
        return "Hola mundo";
    }
}
