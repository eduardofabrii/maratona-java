package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = " Luffy";
        String numeros = "012345678";
        System.out.println(nome.charAt(1));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0,3));
        System.out.println(numeros.substring(0, numeros.length()));
        System.out.println(nome.trim());
    }
}
