package com.universidad.clasificacion;

import java.util.*;

public class ClasificadorAnimales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista de todos los animales
        List<Animal> animales = new ArrayList<>();

        // Mapa de clasificación por tipo
        Map<String, List<Animal>> clasificacion = new TreeMap<>();

        System.out.print("¿Cuántos animales quieres ingresar? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nAnimal #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Tipo (terrestre, aéreo, acuático): ");
            String tipo = scanner.nextLine().toLowerCase();

            System.out.print("Género (masculino, femenino): ");
            String genero = scanner.nextLine().toLowerCase();

            Animal animal = new Animal(nombre, tipo, genero);
            animales.add(animal);

            // Clasificar por tipo
            clasificacion.computeIfAbsent(tipo, k -> new ArrayList<>()).add(animal);
        }

        // Mostrar resultado
        System.out.println("\n📋 Clasificación de animales:");
        clasificacion.forEach((tipo, lista) -> {
            String tipoCapitalizado = tipo.substring(0, 1).toUpperCase() + tipo.substring(1);
            System.out.println(tipoCapitalizado + ":");
            lista.forEach(a -> System.out.println("\t" + a.getNombre()));
        });

        scanner.close();
    }
}
