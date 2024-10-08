package org.example.lambdas.bifunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        /*
         * ✨ BiFunction
         * 💡 Recibe dos valores y retorna un resultado.
         */
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        int result = biFunction.apply(10, 20);
        System.out.println(result);

    }
}
