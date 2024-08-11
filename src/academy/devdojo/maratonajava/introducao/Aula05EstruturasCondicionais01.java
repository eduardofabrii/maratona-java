package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;

        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida alcoolica");
        } else {
            System.out.println("Não pode comprar bebida alcoolica");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Velho demais para beber");
        }

        System.out.println("Fora do IF");


    }
}
