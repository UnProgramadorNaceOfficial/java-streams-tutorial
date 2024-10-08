package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        // 🎯 filter(): Filtra los elementos que cumplen una condición.
        names.stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);

        // 🚀 map(): Transforma los elementos aplicando una función.
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // 📊 sorted(): Ordena los elementos del stream.
        names.stream()
                .sorted()
                .forEach(System.out::println);

        // 💥 forEach(): Aplica una acción a cada elemento.
        names.stream()
                .forEach(name -> System.out.println("Nombre: " + name));

        // 🔗 reduce(): Combina todos los elementos en un solo valor.
        String concatenatedNames = names.stream()
                .reduce("", (a, b) -> a + " " + b);
        System.out.println("Nombres concatenados: " + concatenatedNames);

        // 📦 collect(): Recoge los elementos en una colección.
        List<String> namesStartingWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Nombres que empiezan con A: " + namesStartingWithA);

        // ✨ distinct(): Elimina los elementos duplicados.
        List<String> duplicates = Arrays.asList("Ana", "Luis", "Luis", "Maria", "Pedro");
        duplicates.stream()
                .distinct()
                .forEach(System.out::println);

        // 🎚️ limit(): Limita el número de elementos procesados.
        names.stream()
                .limit(3)
                .forEach(System.out::println);

        // 🔄 skip(): Omite un número específico de elementos.
        names.stream()
                .skip(2)
                .forEach(System.out::println);

        // 🔍 anyMatch(): Verifica si algún elemento cumple una condición.
        boolean anyStartsWithP = names.stream()
                .anyMatch(name -> name.startsWith("P"));
        System.out.println("¿Hay algún nombre que empiece con P?: " + anyStartsWithP);

        // 🔒 allMatch(): Verifica si todos los elementos cumplen una condición.
        boolean allHaveMoreThan3Letters = names.stream()
                .allMatch(name -> name.length() > 3);
        System.out.println("¿Todos los nombres tienen más de 3 letras?: " + allHaveMoreThan3Letters);

        // ❌ noneMatch(): Verifica si ningún elemento cumple una condición.
        boolean noneStartsWithZ = names.stream()
                .noneMatch(name -> name.startsWith("Z"));
        System.out.println("¿Ningún nombre empieza con Z?: " + noneStartsWithZ);
    }
}

