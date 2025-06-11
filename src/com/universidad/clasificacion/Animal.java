package com.universidad.clasificacion;

public class Animal {
    // Atributos
    private String nombre;
    private String tipo;   // terrestre, aéreo, acuático
    private String genero; // masculino, femenino

    // se añaden los constructores
    public Animal(String nombre, String tipo, String genero) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
    }

}
