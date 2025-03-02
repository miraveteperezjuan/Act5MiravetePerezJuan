package com.example.Act5MiravetePerezJuan.controller;


import com.example.Act5MiravetePerezJuan.model.Libreria;
import com.example.Act5MiravetePerezJuan.service.LibreriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("libreria")
public class LibreriaController {

    //http://localhost:8080/libreria

    @Autowired
    private LibreriaService libreriaService;

    //http://localhost:8080/libreria/error
    @GetMapping("error")
    public String getError(){
        return "Error en la app";
    }

    //http://localhost:8080/libreria/addLibreria
    @PostMapping("addLibreria")
    public String addLibreria(@RequestBody Libreria libreria){
        libreriaService.agregarLibreria(libreria);
        return "La libreria " + libreria.getNombre() + " ha sido agregada correctamente";
    }

    @GetMapping("/nombre")
    public ResponseEntity<List<Libreria>> getLibreria(@RequestParam String nombre){
        return new ResponseEntity<>(libreriaService.getLibreriasNombre(nombre),HttpStatus.OK);
    }

}
