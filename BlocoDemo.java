
// Demonstra um bloco de código

public class BlocoDemo {
    public static void main(String[] args) {
        double i, j, d;

        i = 5;
        j = 10;

        //o alvo dessa instrução if-else é um bloco de código
        if(i != 0) {
            System.out.println("I não é igual a zero.");
            d = j / i;
            System.out.println("J dividido por I é igual a " + d);
        } else {
            System.out.println("I é igual a zero.");
        }
    }
    
}
