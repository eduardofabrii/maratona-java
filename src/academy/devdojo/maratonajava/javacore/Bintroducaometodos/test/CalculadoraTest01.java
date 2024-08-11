package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Usando método de somar abaixo: ");
        calculadora.somarDoisNumeros();
        System.out.println("Usando método de subtrair abaixo: ");
        calculadora.subtrairDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01") ;
    }
}
