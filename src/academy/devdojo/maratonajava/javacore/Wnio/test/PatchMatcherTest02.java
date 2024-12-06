package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListTestOrClassAndJavaFiles extends SimpleFileVisitor<Path> {
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}");
    private int count = 0;

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (matcher.matches(file)) {
            if (file.getFileName().toString().endsWith(".java") || file.getFileName().toString().endsWith(".class")) {
                count++;
            System.out.println("Arquivo (" + count + "): " + file.getFileName());
            }
        }

        return FileVisitResult.CONTINUE;
    }
}

public class PatchMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListTestOrClassAndJavaFiles());
    }
}
