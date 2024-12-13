package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Teste de String 01");
        nomes.add("Teste de String 02");

        System.out.println("1° for");
        for (String nome : nomes) {
            System.out.println(nome.replace("e", "3"));
        }

        System.out.println(" ");

        nomes.add("Adicionando String 03 após do 1° for");

        System.out.println("2° for");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
