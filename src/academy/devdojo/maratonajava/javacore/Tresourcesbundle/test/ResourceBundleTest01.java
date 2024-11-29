package academy.devdojo.maratonajava.javacore.Tresourcesbundle.test;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        System.out.println("\nEstamos em pt-BR");
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));

        boolean key1 = bundle.containsKey("good.morning");
        System.out.println("Contem a chave 'good.morning': " + key1);

        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hello"));


        System.out.println("\nEstamos em en-US");
        bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));

        key1 = bundle.containsKey("good.morning");
        System.out.println("Contem a chave 'good.morning': " + key1);

        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hello"));

        System.out.println("\n" + bundle.getString("hi"));
    }
}
