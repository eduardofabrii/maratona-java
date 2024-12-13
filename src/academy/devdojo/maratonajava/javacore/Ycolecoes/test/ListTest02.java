package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {
    public static void main(String[] args) {
        List<String> nomes1 = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes1.add("Teste de String 01");
        nomes2.add("Teste de String 02");
        nomes1.add("Eduardo");
        nomes1.remove("Eduardo");

        nomes1.addAll(nomes2);
        System.out.println(nomes1);

        System.out.println("1° for");
        for (String nome : nomes1) {
            System.out.println(nome.replace("e", "3"));
        }

        System.out.println(" ");

        nomes2.add("Adicionando String 03 após do 1° for");

        System.out.println("2° for");
        for (int i = 0; i < nomes1.size(); i++) {
            System.out.println(nomes1.get(i));
        }

        System.out.println("\n" + nomes1);
    }
}