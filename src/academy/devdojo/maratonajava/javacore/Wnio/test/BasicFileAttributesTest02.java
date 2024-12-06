package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/new.txt");

        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println(basicFileAttributes);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();

        System.out.println("creationTime: " + creationTime);
        System.out.println("lastAcessTime: " + lastAccessTime);
        System.out.println("lastModifiedTime: " + lastModifiedTime);

        System.out.println(" ");

        BasicFileAttributeView getBasicFileAttributeView = Files.getFileAttributeView(path,
                BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        getBasicFileAttributeView.setTimes(lastModifiedTime, newCreationTime, creationTime);

        creationTime = getBasicFileAttributeView.readAttributes().creationTime();
        lastAccessTime = getBasicFileAttributeView.readAttributes().lastAccessTime();
        lastModifiedTime = getBasicFileAttributeView.readAttributes().lastModifiedTime();

        System.out.println("creationTime: " + creationTime);
        System.out.println("lastAcessTime: " + lastAccessTime);
        System.out.println("lastModifiedTime: " + lastModifiedTime);
    }
}
