package com.example.Act5MiravetePerezJuan.service;

import com.example.Act5MiravetePerezJuan.model.Autor;
import com.example.Act5MiravetePerezJuan.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AutorServiceImp implements AutorService {

    //Le dice a Spring que debe buscar y proporcioanr una instancia de la clase
    @Autowired
    private AutorRepository autorRepository;

    @Override
    public Autor agregarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    @Override
    public List<Autor> consultarAutores() {
        return autorRepository.findAll();
    }

}
