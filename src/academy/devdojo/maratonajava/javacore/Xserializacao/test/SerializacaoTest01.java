package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        File dir = new File("pasta-alunos");
        dir.mkdir();
        Aluno aluno = new Aluno(1L, "Eduardo Fabri", "123456");
        Turma turma = new Turma("Maratona Java do DevvvvDojo em breve ricos");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta-alunos/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Paths.get("pasta-alunos/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
