package org.example.lambdas.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        /*
         * 🔍 BiPredicate
         * 💡 Recibe dos valores y devuelve un booleano (true o false).
         */
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        boolean result = biPredicate.test(10, 5);
        System.out.println();
    }
}
