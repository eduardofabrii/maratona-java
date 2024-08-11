package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[5];
        idades[0] = 21;
        idades[1] = 11;
        idades[2] = 18;
        idades[3] = 15;
        idades[4] = 17;
        for (int count = 0; count < idades.length ; count++ ) {
            System.out.println(idades[count]);
        }
    }
}
