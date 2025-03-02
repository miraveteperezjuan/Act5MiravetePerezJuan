package com.example.Act5MiravetePerezJuan.service;

import com.example.Act5MiravetePerezJuan.model.Libreria;
import com.example.Act5MiravetePerezJuan.repository.LibreriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibreriaServiceImp implements LibreriaService{

    @Autowired
    private LibreriaRepository libreriaRepository;

    @Override
    public Libreria agregarLibreria(Libreria libreria) {
        return libreriaRepository.save(libreria);
    }

    @Override
    public List<Libreria> getLibreriasNombre(String nombre) {
        return libreriaRepository.findByNombre(nombre);
    }
}
