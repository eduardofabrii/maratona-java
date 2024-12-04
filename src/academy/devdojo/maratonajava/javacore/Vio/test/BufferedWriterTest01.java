package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Eduardo Fabri\\Documents\\GitHub\\maratona-java\\arquivo\\file2.txt");

        try (FileWriter fw = new FileWriter(file, true)) {
            BufferedWriter br = new BufferedWriter(fw);
            br.write("O Eduardo é bonitão e melhor programador do terrenoooo");
            br.newLine();
            br.write("Eh verdade");
            br.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
