package com.universidad.clasificacion;

import java.util.*;
import java.util.stream.Collectors;

public class GestorPersonas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        System.out.print("¿Cuántas personas deseas ingresar? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nPersona #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            System.out.print("Género (M/F): ");
            String genero = scanner.nextLine().toUpperCase();

            System.out.print("Sueldo por hora: ");
            double sueldoHora = Double.parseDouble(scanner.nextLine());

            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            personas.add(new Persona(nombre, apellido, edad, genero, sueldoHora, cargo));
        }

        // A. Cantidad de personas
        System.out.println("\n👥 Total personas: " + personas.size());

        // B. Promedio de edad
        double promedioEdad = personas.stream()
                .mapToInt(Persona::getEdad)
                .average()
                .orElse(0);
        System.out.println("📊 Promedio edad: " + promedioEdad);

        // C. Cantidad de mayores de edad
        long mayoresEdad = personas.stream()
                .filter(p -> p.getEdad() >= 18)
                .count();
        System.out.println("🔞 Mayores de edad: " + mayoresEdad);

        // D. Personas cuyos nombres empiezan con A
        System.out.println("\n🔤 Nombres que empiezan con 'A':");
        personas.stream()
                .filter(p -> p.getNombre().toUpperCase().startsWith("A"))
                .forEach(System.out::println);

        // E. Personas con apellidos que contienen 'M'
        System.out.println("\n🔍 Apellidos que contienen 'M':");
        personas.stream()
                .filter(p -> p.getApellido().toUpperCase().contains("M"))
                .forEach(System.out::println);

        // 3. Sueldo por 8 horas de directores hombres
        System.out.println("\n💼 Sueldo por 8 horas (Directores M):");
        personas.stream()
                .filter(p -> p.getCargo().equalsIgnoreCase("director") && p.getGenero().equals("M"))
                .map(p -> p.getNombre() + ": $" + (p.getSueldoHora() * 8))
                .forEach(System.out::println);

        scanner.close();
    }
}
