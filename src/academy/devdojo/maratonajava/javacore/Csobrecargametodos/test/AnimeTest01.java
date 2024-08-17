package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        Anime anime2 = new Anime();

        anime1.init("Akudama Drive", "TV", 12, "Ação");
        anime2.init("Paulo Axhamara", "Celular", 15);

        anime1.imprimir();
        anime2.imprimir();
    }
}
