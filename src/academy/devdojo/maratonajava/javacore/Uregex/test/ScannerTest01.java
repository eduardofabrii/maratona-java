package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Erick,Pedro,Paulo,José,true,200";
        Scanner sc = new Scanner(texto);
        sc.useDelimiter(",");

        while (sc.hasNext()) {
            if (sc.hasNextBoolean()) {
                System.out.println("Boolean " + sc.nextBoolean());
            } else {
                sc.next();
            }
        }
    }
}
