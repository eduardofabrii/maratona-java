package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Normalizer;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String projectDiretory = "home/eduardo/dev";
        String txtFile = "../../arquivo.txt";
        Path path1 = Paths.get(projectDiretory, txtFile);
        Path path2 = Paths.get("/home/./eduardo/./dev");

        System.out.println("--- path1 ---");
        System.out.println(path1);
        System.out.println(path1.normalize());

        System.out.println("\n--- path2 ---");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
