package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileAttributeView;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        File dir = new File("pasta4");
        Path path = Paths.get("pasta4/texte.txt");
        boolean isCreate = dir.mkdir();

        if (Files.notExists(path)) {
            Files.createFile(path);
        } else {
            System.out.println("Path already exists!");
        }

        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        dosFileAttributes.isHidden();
        dosFileAttributes.isReadOnly();
        System.out.println(dosFileAttributes.isHidden());
        System.out.println(dosFileAttributes.isReadOnly());

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);

        System.out.println(fileAttributeView.readAttributes().isHidden());
        System.out.println(fileAttributeView.readAttributes().isReadOnly());

//        Files.setAttribute(path, "dos:hidden", false);
//        Files.setAttribute(path, "dos:readonly", false);
    }
}
