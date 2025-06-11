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
            //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public String toString() {
        return nombre;
    }


}
