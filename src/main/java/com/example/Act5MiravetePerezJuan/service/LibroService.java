package com.example.Act5MiravetePerezJuan.service;

import com.example.Act5MiravetePerezJuan.model.Libro;

import java.util.List;

public interface LibroService {

    Libro agregarLibro(Libro libro);

    List<Libro> obtenerTodosLosLibros();

}
