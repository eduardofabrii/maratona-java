package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta3"); // equivalente a new File Pasta3

        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        } else {
            System.out.println("Already exists!");
        }

        Path subpastaPath = Paths.get("pasta3/subpasta/subsubpasta");
        Path pastaDirectory = Files.createDirectories(subpastaPath);

        Path filePath = Paths.get(subpastaPath.toString(), "file.txt");

        if (Files.notExists(filePath)) {
            Path file = Files.createFile(filePath);
        } else {
            System.out.println("Path file is already create.");
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
