package academy.devdojo.maratonajava.javacore.Oexception.test.error;

public class StackoverFlowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
