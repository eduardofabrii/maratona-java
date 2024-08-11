package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;
    public int matricula;

    public void imprimir() {
        System.out.println("Nome: " + this.nome + ", idade: " + this.idade + " anos, sexo: " + this.sexo + ", matrícula: " + this.matricula);
    }
}
