package com.example;

import java.util.Objects;
import java.util.UUID;

public class Libro {

    private String isbn;
    private String titulo;
    private Autor autor;
    private int anioPublicacion;
    private double precio;
    private int stock;

    public Libro() {
        this.isbn = UUID.randomUUID().toString();
        this.titulo = "Sin titulo";
        this.autor = new Autor();
        this.anioPublicacion = 0;
        this.precio = 0.0;
        this.stock = 0;
    }

    public Libro(String isbn, String titulo, Autor autor, int anioPublicacion, double precio, int stock) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
        setAnioPublicacion(anioPublicacion);
        setPrecio(precio);
        setStock(stock);
    }

    public Libro(String isbn, String titulo, Autor autor, int anioPublicacion) {
        this(isbn, titulo, autor, anioPublicacion, 0.0, 0);
    }

    public Libro(String titulo, Autor autor) {
        this(UUID.randomUUID().toString(), titulo, autor, 0, 0.0, 0);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn == null || isbn.isBlank()) {
            throw new IllegalArgumentException("El ISBN no puede estar vacio");
        }
        this.isbn = isbn.trim();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("El titulo no puede estar vacio");
        }
        this.titulo = titulo.trim();
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        if (autor == null) {
            throw new IllegalArgumentException("El autor no puede ser nulo");
        }
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion < 0) {
            throw new IllegalArgumentException("El anio de publicacion no puede ser negativo");
        }
        this.anioPublicacion = anioPublicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", anioPublicacion=" + anioPublicacion +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Libro)) {
            return false;
        }
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
