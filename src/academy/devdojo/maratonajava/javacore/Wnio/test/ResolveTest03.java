package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest03 {
    public static void main(String[] args) {
        Path diretory = Paths.get("home/eduardo");
        Path file1 = Paths.get("dev/arquivo.txt");
        Path resolve = diretory.resolve(file1);

        System.out.println(diretory);
        System.out.println(file1);
        System.out.println(resolve);

        Path absolute = Paths.get("/home/eduardo");
        Path relative = Paths.get("dev");
        Path file2 = Paths.get("file.txt");
        System.out.println("1 " + absolute.resolve(relative));
        System.out.println("2 " + absolute.resolve(file2));
        System.out.println("3 " + relative.resolve(absolute));
        System.out.println("4 " + relative.resolve(file2));
        System.out.println("5 " + file2.resolve(absolute));
        System.out.println("6 " + file2.resolve(relative));
    }
}
