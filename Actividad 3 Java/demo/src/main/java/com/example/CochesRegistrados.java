package com.example;

import com.example.Main.Carro_de_carreras;

public class CochesRegistrados {

    public static void main(String[] args) {
        Carro_de_carreras carro1 = new Carro_de_carreras("Clase A", "Ferrari", "SF90", "710 hp", "1435 kg", "Rojo", "V8");
        Carro_de_carreras carro2 = new Carro_de_carreras("Clase B", "Lamborghini", "Huracán EVO", "640 hp", "1422 kg", "Amarillo", "V10");
        Carro_de_carreras carro3 = new Carro_de_carreras("Clase C", "Porsche", "911 GT3 RS", "520 hp", "1430 kg", "Negro", "Flat-6");

        System.out.println("Vehículos inscritos en la carrera:");
        System.out.println("1. Marca: " + carro1.marca + ", Modelo: " + carro1.modelo + ", Potencia: " + carro1.Pontecia + ", Peso: " + carro1.Peso + ", Color: " + carro1.color + ", Tipo de motor: " + carro1.tipo_motor);
        System.out.println("2. Marca: " + carro2.marca + ", Modelo: " + carro2.modelo + ", Potencia: " + carro2.Pontecia + ", Peso: " + carro2.Peso + ", Color: " + carro2.color + ", Tipo de motor: " + carro2.tipo_motor);
        System.out.println("3. Marca: " + carro3.marca + ", Modelo: " + carro3.modelo + ", Potencia: " + carro3.Pontecia + ", Peso: " + carro3.Peso + ", Color: " + carro3.color + ", Tipo de motor: " + carro3.tipo_motor);
    }
}
