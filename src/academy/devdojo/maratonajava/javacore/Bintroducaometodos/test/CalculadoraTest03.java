package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.dividirDoisNumeros(5, 2);
        System.out.println(result);

        int result2 = (int) calculadora.dividirDoisNumeros(100, 0);
        System.out.println(result2);

        int result3 = (int) calculadora.dividirDoisNumeros(100, 2);
        System.out.println(result2);

        System.out.println(calculadora.dividirDoisTeste(100, 2));

        calculadora.imprimirDivisaoDeDoisNumeros01(86, 0);
    }
}
