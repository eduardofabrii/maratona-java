package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
      // Imprimir todos os numeros pares de 1 até 1.000.000

        for (int count = 1; count <= 1000000; count++) {
            if (count % 2 == 0) {
                System.out.println(count);
            }
        }
    }
}
