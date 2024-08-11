package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Eduardo";
        estudante01.idade = 17;
        estudante01.sexo = 'M';
        estudante01.matricula = 000001;

        estudante02.nome = "Graziele";
        estudante02.idade = 18;
        estudante02.sexo = 'F';
        estudante02.matricula = 000002;

        impressora.imprimir(estudante01);
        impressora.imprimir(estudante02);
        System.out.println("###########");
        impressora.imprimir(estudante01);
        impressora.imprimir(estudante02);
    }
}
