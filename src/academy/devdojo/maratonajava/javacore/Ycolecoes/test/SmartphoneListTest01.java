package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("11111", "iPhone");
        Smartphone smartphone2 = new Smartphone("22222", "Pixel");
        Smartphone smartphone3 = new Smartphone("33333", "A54");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(0, smartphone3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone smartphone4 = new Smartphone("22222", "Pixel");

        boolean contains = smartphones.contains(smartphone4);
        int indexSmartphone4 = smartphones.indexOf(smartphone4);
        System.out.println("Index S4: " + indexSmartphone4);
        System.out.println("Contains S4: " + contains);
        System.out.println("Get Index" + smartphones.get(indexSmartphone4));
        System.out.println(smartphones);
    }
}
