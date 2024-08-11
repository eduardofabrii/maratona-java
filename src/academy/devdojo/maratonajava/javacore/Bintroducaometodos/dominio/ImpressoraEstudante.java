package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprimir(Estudante estudante) {
        System.out.println("Nome: " + estudante.nome + ", idade: " + estudante.idade + " anos, sexo: " + estudante.sexo + ", matrícula: " + estudante.matricula);
        estudante.nome = "Pedro";
    }
}
