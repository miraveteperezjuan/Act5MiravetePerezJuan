package com.example.Act5MiravetePerezJuan.controller;

import com.example.Act5MiravetePerezJuan.model.Editorial;
import com.example.Act5MiravetePerezJuan.service.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//http://localhost:8080/editorial/

@RestController
@RequestMapping("editorial")
public class EditorialController {

    @Autowired
    private EditorialService editorialService;

    //http://localhost:8080/editorial/error
    @GetMapping("error")
    public String getError(){
        return "Error en la app";
    }

    //http://localhost:8080/editorial/addEditorial
    @PostMapping("addEditorial")
    public String addAutores(@RequestBody Editorial editorial){
        editorialService.agregarEditorial(editorial);
        return "Editorail agregada correctamente con nombre" + editorial.getNombre();
    }

}
