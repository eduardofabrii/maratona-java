package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Eduardo Fabri\\Documents\\GitHub\\maratona-java\\arquivo\\file2.txt");

        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("\nO Eduardo é bonitão e melhor programador do terrenooooo\nEu concordo emmm");

            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
