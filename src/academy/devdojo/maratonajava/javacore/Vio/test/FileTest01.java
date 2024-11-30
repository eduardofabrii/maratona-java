package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class FileTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("C:\\Users\\Eduardo Fabri\\Documents\\GitHub\\maratona-java\\arquivo\\file.txt");
        boolean isDeleted = file.delete();

        try {
            boolean exists = file.exists();
            System.out.println("Exists: " + exists);

            boolean isCreated = file.createNewFile();
            System.out.println("isCreated: " + isCreated);

            exists = file.exists();
            System.out.println("Exists: " + exists);


            if (exists) {
                System.out.print("Remove [y] or [n]: ");
                String ans = sc.next();

                if (ans.equals("y")) {
                    isDeleted = file.delete();
                    System.out.println("isDeleted: " + isDeleted);
                } else {
                    System.out.println("isDeleted: " + isDeleted);
                }

                System.out.println("path: " + file.getAbsolutePath());
                System.out.println("is directory: " + file.isDirectory());
                System.out.println("is file: " + file.isFile());
                System.out.println("is hidden: " + file.isHidden());
                System.out.println("can read: " + file.canRead());
                System.out.println("can write: " + file.canWrite());
                System.out.println("last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
