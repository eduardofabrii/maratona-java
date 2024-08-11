package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        /* Tipos Primitivos:
        int, double, float, chat, byte, short, long, boolean
         */

        int idade = (int) 10000000000l;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0d;
        float salarioFloat = (float) 2500.0d;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'G';
        String nome = "Eduardo";

        System.out.println("Idade: " + idade + " anos.");
        System.out.println(verdadeiro);
        System.out.println(salarioFloat);

    }
}
