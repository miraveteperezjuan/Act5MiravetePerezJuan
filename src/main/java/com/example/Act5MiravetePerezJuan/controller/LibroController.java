package com.example.Act5MiravetePerezJuan.controller;


import com.example.Act5MiravetePerezJuan.model.Libro;
import com.example.Act5MiravetePerezJuan.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http://localhost:8080/libro/

@RestController
@RequestMapping("libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("error")
    public String getError(){
        return "Error en la app";
    }

    //http://localhost:8080/libro/addLibro
    @PostMapping("addLibro")
    public String addLibro(@RequestBody Libro libro){
        libroService.agregarLibro(libro);
        return "Libro agregado correctamente " + libro.getTitulo();
    }

    //http://localhost:8080/libro/todosLibros
    @GetMapping("todosLibros")
    public ResponseEntity<List<Libro>> getAllLibros(){
        return new ResponseEntity<>(libroService.obtenerTodosLosLibros(), HttpStatus.OK);
    }

}
