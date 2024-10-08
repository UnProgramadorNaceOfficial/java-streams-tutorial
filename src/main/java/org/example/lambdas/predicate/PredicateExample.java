package org.example.lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        /*
         * ✅ Predicate
         * 💡 Recibe un valor y devuelve un booleano (true o false).
         */
        Predicate<String> predicate = str -> str.length() > 5;
        boolean result = predicate.test("Hola Mundo");
        System.out.println(result);

    }
}
