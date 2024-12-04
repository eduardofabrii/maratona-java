package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretory = new File("pasta");
        boolean isDirCriado = fileDiretory.mkdir();
        System.out.println("Diretorio criado: " + isDirCriado);

        File fileArquivoDiretorio = new File("pasta", "file.txt");
        boolean isNewFile = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo criado: " + isNewFile);

        File fileRenamed = new File("pasta", "arquivo_renomeado.txt");
        boolean b = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado: " + b);

        File diretorioRenamed = new File("pasta2");
        boolean b1 = fileDiretory.renameTo(diretorioRenamed);
        System.out.println(b1);

    }
}
