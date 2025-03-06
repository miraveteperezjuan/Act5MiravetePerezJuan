package com.example.Act5MiravetePerezJuan.controller;

import com.example.Act5MiravetePerezJuan.model.Autor;
import com.example.Act5MiravetePerezJuan.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

//http://localhost:8080/autor/

@RestController
@RequestMapping("autor")
public class AutorController {

    @Autowired
    private AutorService autorService;

    //http://localhost:8080/autor/error
    @GetMapping("error")
    public String getError(){
        return "Error en la app";
    }

    //http://localhost:8080/autor/addAutores
    @PostMapping("addAutores")
    public String addAutores(@RequestBody Autor autor){
       autorService.agregarAutor(autor);
       return "Autor agregado correctamente con nombre " + autor.getNombre();
    }

    //http://localhost:8080/autor/todosAutores
    @GetMapping("todosAutores")
    public ResponseEntity<List<Autor>> getAllAutores(){
        return new ResponseEntity<>(autorService.consultarAutores(),HttpStatus.OK);
    }

}
