package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
//        Imprima os primeiros 25 números de um dado valor. Por exemplo, 50.
        int valorMax = 50;
        for (int count = 0; count < valorMax; count++) {
            if (count > 25) {
                break;
            }
            System.out.println("Count: " + count);
        }

    }
}
