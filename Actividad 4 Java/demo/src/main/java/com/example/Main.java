package com.example;

public class Main {
    public static void main(String[] args) {
        Autor autorCompleto = new Autor("AUT-001", "Gabriel Garcia Marquez", "Colombiana", 1927);
        Autor autorSinId = new Autor("Isabel Allende", "Chilena", 1942);
        Autor autorVacio = new Autor();

        Libro libroCompleto = new Libro(
                "978-0307474728",
                "Cien anios de soledad",
                autorCompleto,
                1967,
                45000.0,
                12);
        Libro libroSinPrecioNiStock = new Libro(
                "978-8401352836",
                "La casa de los espiritus",
                autorSinId,
                1982);
        Libro libroMinimo = new Libro("Rayuela", new Autor("Julio Cortazar", "Argentina", 1914));

        Usuario usuarioCompleto = new Usuario("USR-001", "Laura Gomez", "laura.gomez@correo.com", 2);
        Usuario usuarioSinId = new Usuario("Carlos Perez", "carlos.perez@correo.com");
        Usuario usuarioVacio = new Usuario();

        usuarioSinId.setLibrosPrestados(1);
        libroSinPrecioNiStock.setPrecio(38000.0);
        libroSinPrecioNiStock.setStock(5);

        System.out.println("=== Autores ===");
        System.out.println(autorCompleto);
        System.out.println(autorSinId);
        System.out.println(autorVacio);

        System.out.println("\n=== Libros ===");
        System.out.println(libroCompleto);
        System.out.println(libroSinPrecioNiStock);
        System.out.println(libroMinimo);

        System.out.println("\n=== Usuarios ===");
        System.out.println(usuarioCompleto);
        System.out.println(usuarioSinId);
        System.out.println(usuarioVacio);
    }
}
