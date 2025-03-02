package com.example.Act5MiravetePerezJuan.repository;

import com.example.Act5MiravetePerezJuan.model.Libreria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibreriaRepository extends JpaRepository<Libreria, Integer> {

    List<Libreria> findByNombre(String nombre);

}
