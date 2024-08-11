package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante03 = new Estudante();

        estudante01.nome = "Rudney";
        estudante01.idade = 41;
        estudante01.sexo = 'M';
        estudante01.matricula = 1;

        estudante02.nome = "Cris";
        estudante02.idade = 40;
        estudante02.sexo = 'F';
        estudante02.matricula = 2;

        estudante03.nome = "Tais";
        estudante03.idade = 38;
        estudante03.sexo = 'F';
        estudante03.matricula = 3;

        estudante01.imprimir();
        estudante02.imprimir();
        estudante03.imprimir();
    }
}
