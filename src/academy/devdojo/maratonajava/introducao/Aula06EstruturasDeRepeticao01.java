package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
//        while, do while, for

        int count = 0;

        while (count < 10) {
            System.out.println("Dentro do While: - " + ++count);
        }

        do {
            System.out.println("Dentro do Do While - " + ++count);
        } while (count < 9);

        for (int i = 0; i < 10; i++) {
            System.out.println("Dentro do For - " + i);
        }
    }
}
