package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1234", "Apple");
        Smartphone smartphone2 = new Smartphone("1234", "Apple");
        Smartphone smartphone3 = smartphone1;
        Smartphone smartphone4 = new Smartphone("1234", "Pixel");
        System.out.println("s1.equals(s2): " + smartphone1.equals(smartphone2)); // Temos agora o equals sobrescrito dentro de Smartphone
        System.out.println("s1.equals(s3=s1): " + smartphone1.equals(smartphone3));
        System.out.println("s1.equals(s4): " + smartphone1.equals(smartphone4));
    }
}
