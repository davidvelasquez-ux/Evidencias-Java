package com.example;

public class Piloto 
{
    private String nombre;
    private String nacionalidad;
    private int edad;
    private int posicionFinal; 
    private double tiempoSegundos;
    

    public Piloto(String nombre, String nacionalidad, int edad, int posicionFinal, double tiempoSegundos) 
    {
       this.nombre = nombre;
       this.nacionalidad = nacionalidad;
       this.edad = edad;
       this.posicionFinal = posicionFinal;
       this.tiempoSegundos = tiempoSegundos;

    }

// geters y seters click derecho > sorce adition > getter and setter
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNacionalidad() {
        return nacionalidad;
    }


    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public int getPosicionFinal() {
        return posicionFinal;
    }


    public void setPosicionFinal(int posicionFinal) {
        this.posicionFinal = posicionFinal;
    }


    public double getTiempoSegundos() {
        return tiempoSegundos;
    }


    public void setTiempoSegundos(double tiempoSegundos) {
        this.tiempoSegundos = tiempoSegundos;
    }
// hacer un padre con 3 hijos que cada hijo tenga algo unico, que los hijos
//  le hagan override a los metodos del padre añadiendo algo y override al to string, 
// que todos tengn geter y seteer y los valores logicos 

    
}