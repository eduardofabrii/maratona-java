package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = new int[5];
        for (int count = 0; count < numeros.length; count++) {
            numeros[count] = count + 1;

        }

        for (int count = 0; count < numeros.length; count++) {
            System.out.println(numeros[count]);
        }

        calculadora.somarArray(numeros);
        System.out.println("#####################");

        calculadora.somarVarArgs(numeros);
        calculadora.somarVarArgs(1, 2, 3, 4, 5);
    }
}
