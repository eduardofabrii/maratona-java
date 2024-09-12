package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Ferrari extends Carro {
    private String modelo;

    public final void imprimir() {
        super.imprimir();
        System.out.println("Modelo: " + this.modelo);
    }
}
