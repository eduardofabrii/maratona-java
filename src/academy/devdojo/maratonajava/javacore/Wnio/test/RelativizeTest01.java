package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/eduardo");
        Path clazz = Paths.get("/home/eduardo/devdojotop/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absolute1 = Paths.get("/home/eduardo");
        Path absolute2 = Paths.get("/userrr/local");
        Path absolute3 = Paths.get("/home/eduardo/devdojotop/OlaMundo.java");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/temp.2021923");

        System.out.println("1 " + absolute1.relativize(absolute3));
        System.out.println("2 " + absolute3.relativize(absolute1)); // voltar 2 diretorios
        System.out.println("3 " + absolute1.relativize(absolute2)); // voltar 2 diretorios  até chegar no root/raiz e
        // entrar em
        // userrr e local
        System.out.println("4 " + relative2.relativize(relative1));
        System.out.println("5 " + relative1.relativize(relative2));
        System.out.println("6 " + absolute2.relativize(absolute1));
//        System.out.println("7 " + relative2.relativize(absolute2)); // lança excecao para relativizar relatives e
        // absolutos, ja que o java nao consegue saber onde está o relativo
        System.out.println("7" + relative2.relativize(absolute3)); // a mesma coisa de cima
    }
}
