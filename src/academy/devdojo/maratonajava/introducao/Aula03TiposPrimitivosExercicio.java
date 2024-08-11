package academy.devdojo.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Eduardo Henrique Fabri";
        String endereco = "Rua Roberto Gava, n° 11";
        float salario = 2600.50f;
        String dataRecebimentoSalario = "05/08/2024";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de R$" + salario + ", na data " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
