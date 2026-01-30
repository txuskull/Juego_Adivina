# Juego_Adivina

Plantilla básica de un juego para adivinar números escrita en Kotlin.

## Descripción
Este repositorio contiene una implementación inicial del "Juego Adivina" en Kotlin. Está pensado como plantilla educativa y punto de partida.

## Requisitos
- JDK 11 o superior
- Kotlin compiler o IntelliJ IDEA

## Ejecución
1) Desde IntelliJ IDEA
   - Abre el proyecto en IntelliJ y ejecuta la clase `main` (si existe).

2) Con el compilador de Kotlin (si no hay Gradle)
   - Compilar:
     kotlinc src -include-runtime -d JuegoAdivina.jar
   - Ejecutar:
     java -jar JuegoAdivina.jar

## Sugerencias
- Añadir un sistema de build (Gradle) y el wrapper para facilitar compilación y CI.
- Añadir tests unitarios (JUnit 5 o Kotest).
- Añadir linters (ktlint/detekt) y ejecutarlos en CI.


