package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Seminario;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Professor;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Paulo Moraes", 21);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {};
        Seminario seminario = new Seminario("Onde achar o Tesouro?", alunosParaSeminario, local);


        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprimir();
    }
}
