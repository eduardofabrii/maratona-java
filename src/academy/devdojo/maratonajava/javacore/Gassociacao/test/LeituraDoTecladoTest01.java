package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma mensagem: ");
        String next = sc.nextLine();
        System.out.print("Digite M ou F para seu sexo: ");
        char sexo = sc.next().charAt(0);

        System.out.println("\n------------ Relatório -------------");
        System.out.println("Mensagem: " + next);
        System.out.println("Sexo: " + sexo);
        System.out.println("------------------------------------");


    }
}
