package org.example.callable;

import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String[] args) {
        /*
         * 📞 Callable
         * 💡 No recibe valores, pero retorna un resultado y puede lanzar una excepción.
         */
        Callable<String> callable = () -> "Resultado de la tarea";

        try {
            String resultado = callable.call();
            System.out.println(resultado);
        } catch (Exception e) {
            System.err.println("Error al llamar la funcion callable");
        }
    }
}
