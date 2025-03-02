package com.example.Act5MiravetePerezJuan.service;

import com.example.Act5MiravetePerezJuan.model.Libreria;

import java.util.List;

public interface LibreriaService {

    Libreria agregarLibreria(Libreria libreria);

    List<Libreria> getLibreriasNombre(String nombre);

}
