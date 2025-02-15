package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
//    0 - Bloco de inicialização estático é executado quando a JVM carregar a classe
//    1 - Alocado espaco em memória pro objeto
//    2 - Cada atributo de classe eh criado e inicializado com valores default ou o que for passado
//    3 - Bloco de inicialização é iniciliazado
//    4 - Construtor é executado
    static {
        System.out.println("Dentro do bloco de inicialização | Static 1.");
        episodios = new int[20];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização | Static 2.");
    }
//
//    {
//        System.out.println("Dentro do bloco de inicialização | Não Static.");
//    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}