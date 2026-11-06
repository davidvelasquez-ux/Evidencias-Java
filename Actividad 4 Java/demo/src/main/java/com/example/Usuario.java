package com.example;

import java.util.Objects;
import java.util.UUID;

public class Usuario {

    private String idUsuario;
    private String nombre;
    private String correoElectronico;
    private int librosPrestados;

    public Usuario() {
        this.idUsuario = UUID.randomUUID().toString();
        this.nombre = "Isaac Morgan";
        this.correoElectronico = "isaacmorgan@gmail.com";
        this.librosPrestados = 0;
    }

    public Usuario(String idUsuario, String nombre, String correoElectronico, int librosPrestados) {
        setIdUsuario(idUsuario);
        setNombre(nombre);
        setCorreoElectronico(correoElectronico);
        setLibrosPrestados(librosPrestados);
    }

    public Usuario(String nombre, String correoElectronico) {
        this(UUID.randomUUID().toString(), nombre, correoElectronico, 0);
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        if (idUsuario == null || idUsuario.isBlank()) {
            throw new IllegalArgumentException("El id del usuario no puede estar vacio");
        }
        this.idUsuario = idUsuario.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del usuario no puede estar vacio");
        }
        this.nombre = nombre.trim();
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronico == null || !correoElectronico.contains("@")) {
            throw new IllegalArgumentException("El correo electronico no es valido");
        }
        this.correoElectronico = correoElectronico.trim();
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(int librosPrestados) {
        if (librosPrestados < 0) {
            throw new IllegalArgumentException("Los libros prestados no pueden ser negativos");
        }
        this.librosPrestados = librosPrestados;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario='" + idUsuario + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", librosPrestados=" + librosPrestados +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Usuario)) {
            return false;
        }
        Usuario usuario = (Usuario) o;
        return Objects.equals(idUsuario, usuario.idUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario);
    }
}
