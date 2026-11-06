package com.example;

import java.util.Objects;
import java.util.UUID;

public class Autor {

    private String idAutor;
    private String nombre;
    private String nacionalidad;
    private int anioNacimiento;

    public Autor() {
        this.idAutor = UUID.randomUUID().toString();
        this.nombre = "Sin nombre";
        this.nacionalidad = "Desconocida";
        this.anioNacimiento = 0;
    }

    public Autor(String idAutor, String nombre, String nacionalidad, int anioNacimiento) {
        setIdAutor(idAutor);
        setNombre(nombre);
        setNacionalidad(nacionalidad);
        setAnioNacimiento(anioNacimiento);
    }

    public Autor(String nombre, String nacionalidad, int anioNacimiento) {
        this(UUID.randomUUID().toString(), nombre, nacionalidad, anioNacimiento);
    }

    public String getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(String idAutor) {
        if (idAutor == null || idAutor.isBlank()) {
            throw new IllegalArgumentException("El id del autor no puede estar vacio");
        }
        this.idAutor = idAutor.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del autor no puede estar vacio");
        }
        this.nombre = nombre.trim();
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        if (nacionalidad == null || nacionalidad.isBlank()) {
            throw new IllegalArgumentException("La nacionalidad no puede estar vacia");
        }
        this.nacionalidad = nacionalidad.trim();
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        if (anioNacimiento < 0) {
            throw new IllegalArgumentException("El anio de nacimiento no puede ser negativo");
        }
        this.anioNacimiento = anioNacimiento;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "idAutor='" + idAutor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Autor)) {
            return false;
        }
        Autor autor = (Autor) o;
        return Objects.equals(idAutor, autor.idAutor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAutor);
    }
}
