package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // String = null
        // byte, short, int, long, float e double = 0
        // boolean = false
        // char = '\u0000'

        String[] nomes = new String[4];
        nomes[0] = "Eduardo Henrique Fabri";
        nomes[1] = "Rudney Fabri";
        nomes[2] = "Cristiane Zélia Kutz Fabri";
        nomes[3] = "Graziele Andrade Tieppo";

        for (int count = 0; count < nomes.length; count++) {
            System.out.println("Nome " + (count + 1) + ": " + (nomes[count]) + ".");
        }
    }
}
