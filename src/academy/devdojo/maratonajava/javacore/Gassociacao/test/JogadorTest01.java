package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};


        System.out.println("1° opção de acessar: ");

        for (Jogador jogador : jogadores) {
            jogador.imprimir();
        }

        System.out.println("2° opção de acessar:\n" + jogadores[1].getNome());
    }
}
