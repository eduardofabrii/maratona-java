package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
//        Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
//        Condicao é que o valor da parcela tem que ser maior ou igual a mil

        float valorCarro = 10000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {

            double valorParcela = valorCarro / parcela;

            if (valorParcela < 1000) {
                break;
            }

            System.out.println("Parcela " + parcela + " | R$" + valorParcela);
        }
    }
}
