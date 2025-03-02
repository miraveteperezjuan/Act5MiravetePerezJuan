package com.example.Act5MiravetePerezJuan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "libreria")
public class Libreria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column(name = "nombre_duenio")
    private String nombreDuenio;
    @Column
    private String direccion;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "libreria_libro", joinColumns = @JoinColumn(name = "id_libreria"),
            inverseJoinColumns = @JoinColumn(name = "id_libro"))
    private List<Libro> libros;

    public Libreria(String nombre, String nombreDuenio, String direccion) {
        this.nombre = nombre;
        this.nombreDuenio = nombreDuenio;
        this.direccion = direccion;
    }

    public Libreria() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public Libreria(String nombre, String nombreDuenio, String direccion, List<Libro> libros) {
        this.nombre = nombre;
        this.nombreDuenio = nombreDuenio;
        this.direccion = direccion;
        this.libros = libros;
    }
}
