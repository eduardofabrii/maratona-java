package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - / *
        float numero01 = 10;
        float numero02 = 20;
        float soma = numero01 / numero02;
        System.out.println(soma);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("Dez maior que vinte? " + isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("Dez menor que vinte? " + isDezMenorQueVinte);
        boolean isDezIgualAVinte = 10 == 20;
        System.out.println("Dez igual a vinte? " + isDezIgualAVinte);
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("Dez diferente de vinte? " + isDezDiferenteDeVinte);

        // && (and)  -  ||(or)  -   !(not)
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("O Playstation é compravel? " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        // É a mesma coisa de ( bonus = bonus + 1000; ) e serve para todos os sinais
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        contador++;
        int contador2 = 0;
        System.out.println(++contador2);
        System.out.println(contador2);
    }
}
