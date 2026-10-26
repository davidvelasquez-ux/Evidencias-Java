package com.example;

public class Main {

    // La clase es "static" para poder crear objetos sin necesitar una instancia de Main
    public static class Carro_de_carreras {
        String clase;
        String marca;
        String modelo;
        String Pontecia;
        String Peso;
        String color;
        String tipo_motor;

        public Carro_de_carreras(String clase, String marca, String modelo, String Pontecia, String Peso, String color, String tipo_motor) {
            this.clase = clase;
            this.marca = marca;
            this.modelo = modelo;
            this.Pontecia = Pontecia;
            this.Peso = Peso;
            this.color = color;
            this.tipo_motor = tipo_motor;
        }
    }
}
