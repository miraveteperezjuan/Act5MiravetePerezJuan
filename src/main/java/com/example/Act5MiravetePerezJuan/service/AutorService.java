package com.example.Act5MiravetePerezJuan.service;

import com.example.Act5MiravetePerezJuan.model.Autor;

import java.util.Date;
import java.util.List;

public interface AutorService {

    Autor agregarAutor(Autor autor);

    List<Autor> consultarAutores();

}
