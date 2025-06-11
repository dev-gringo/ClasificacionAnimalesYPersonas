# Clasificación de Animales y Gestión de Personas en Java 🐾👩‍💼

Este proyecto en Java aplica Programación Orientada a Objetos (POO), colecciones, y programación funcional con **Streams y Lambdas**, para resolver dos problemas clásicos: la **clasificación de animales** y el **análisis de datos de personas**.

---

##  Tecnologías usadas

- Java 11 o superior
- IntelliJ IDEA
- Colecciones (`List`, `Map`, `ArrayList`, `TreeMap`)
- Streams, Lambdas, Optional, Comparator

---

##  Estructura del Proyecto

```text
src/
└── com.universidad.clasificacion
    ├── Animal.java
    ├── ClasificadorAnimales.java
    ├── Persona.java
    └── GestorPersonas.java

 1. Clasificador de Animales
Funcionalidad:

Solicita por consola animales con nombre, tipo y género.

Clasifica automáticamente en terrestres, aéreos, o acuáticos.

Muestra los animales agrupados por tipo.

Ejemplo de salida:

 Clasificación de animales:
Acuático:
    Delfín
Aéreo:
    Águila
Terrestre:
    Perro


2. Gestión de Personas
Funcionalidad básica:

Permite ingresar personas con atributos: nombre, apellido, edad, género, sueldo por hora y cargo.

Realiza análisis con streams:

Total de personas

Promedio de edad

Cantidad de mayores de edad

Filtrar por nombre/apellido

Extras avanzados implementados:

Mostrar sueldo por 8h con peek

Buscar la primera desarrolladora mujer con findFirst

Encontrar el desarrollador mejor pagado por hora usando Optional y max

Ordenar todas las mujeres por nombre usando Comparator.comparing


 Cómo ejecutar
Clona el proyecto:

https://github.com/dev-gringo/ClasificacionAnimalesYPersonas

Abre en IntelliJ y ejecuta:

ClasificadorAnimales.java para el módulo de animales

GestorPersonas.java para el módulo de personas

Interactúa vía consola ingresando los datos solicitados.

💡 Autor: Stiven Arias
Proyecto académico desarrollado como actividad de programación orientada a objetos y colecciones en Java.
Incluye prácticas modernas de stream API, lambda expressions, y análisis de datos funcional.

