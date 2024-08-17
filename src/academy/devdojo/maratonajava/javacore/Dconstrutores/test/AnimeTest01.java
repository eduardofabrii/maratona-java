package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Haikyuu", "TV", 12, "Ação");
        Anime anime2 = new Anime();
        Anime anime3 = new Anime("Haikyuu", "TV", 12, "Ação", "VFX");

        anime1.imprimir();
        System.out.println(" ");
        anime2.imprimir();
        System.out.println(" ");
        anime3.imprimir();

    }
}
