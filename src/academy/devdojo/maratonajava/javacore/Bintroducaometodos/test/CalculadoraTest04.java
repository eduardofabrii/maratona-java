package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

//        Esse valor nao altera dentro do metodo pq o java cria uma copia desse valor e mesmo assim o valor
//        original dentro do metodo nao é alterado NUNCA
        int a = 1;
        int b = 2;

        calculadora.alterarDoisNumeros(a, b);

        System.out.println("Dentro do CalculadoraTest04");
        System.out.println("num1: " + a);
        System.out.println("num2: " + b);
    }
}
