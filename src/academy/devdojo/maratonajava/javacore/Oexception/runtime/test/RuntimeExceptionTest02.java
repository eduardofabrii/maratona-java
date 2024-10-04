package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(2, 1));

        try {
            System.out.println(divisao(1, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Código finalizado");
    }

    /**
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0.");
        }
//        try {
//            return a / b;
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }
//        return 0;
        return a/b;
    }
}

