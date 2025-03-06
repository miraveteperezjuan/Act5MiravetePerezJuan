package com.example.Act5MiravetePerezJuan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "libro")
public class Libro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String titulo;

    @Column
    private double precio;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_autor")
    private Autor autor;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_editorial")
    private Editorial editorial;

    @ManyToMany(mappedBy = "libros", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Libreria> librerias;

    public Libro(String titulo, double precio, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Libro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public List<Libreria> getLibrerias() {
        return librerias;
    }

    public void setLibrerias(List<Libreria> librerias) {
        this.librerias = librerias;
    }

    public Libro(String titulo, double precio, Autor autor, Editorial editorial, List<Libreria> librerias) {
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
        this.editorial = editorial;
        this.librerias = librerias;
    }
}
