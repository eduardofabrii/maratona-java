package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar Jr");
        Jogador jogador2 = new Jogador("Pelé");
        Time time1 = new Time("Seleção Brasileira");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time1);
        jogador2.setTime(time1);
        time1.setJogadores(jogadores);

        System.out.println("======= Jogador 01 =======");
        jogador1.imprimir();

        System.out.println("======= Jogador 02 =======");
        jogador2.imprimir();

        System.out.println("======= Time =======");
        time1.imprimir();
    }
}
