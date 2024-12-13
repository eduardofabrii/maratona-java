package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTes01 {
    public static void main(String[] args) {
        List<String> filmes = new ArrayList<>(6);
        filmes.add("Rei Leão Live Action");
        filmes.add("As trancas de um careca");
        filmes.add("Rapunzel 2");
        filmes.add("Carros 3");
        filmes.add("Senna");
        Collections.sort(filmes);

        for (String filme : filmes) {
            System.out.print(filme + " | ");
        }

        List<Double> salarios = new ArrayList<>();
        salarios.add(674.13);
        salarios.add(1000d);
        salarios.add(1800d);
        salarios.add(956.15);
    }
}
