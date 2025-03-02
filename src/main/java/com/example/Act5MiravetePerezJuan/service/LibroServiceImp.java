package com.example.Act5MiravetePerezJuan.service;

import com.example.Act5MiravetePerezJuan.model.Libro;
import com.example.Act5MiravetePerezJuan.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImp implements LibroService {

    @Autowired
    private LibroRepository libroRepository;


    @Override
    public Libro agregarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public List<Libro> obtenerTodosLosLibros() {
        return libroRepository.findAll();
    }
}