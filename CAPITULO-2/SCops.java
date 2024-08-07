// Demonstra os operadores de curto-circuito.
public class SCops {
    public static void main(String[] args) {
        int n, d;

        n= 10; 
        d = 2;
        if(d != 0 && (n % d) == 0)
        System.out.println(d + " é um fator de " + n);

        d = 0; // configura d com zero

        // Já que d é igual a zero, o segundo operando não é avaliado.
        if(d != 0 && (n % d) ==0)
        System.out.println(d + " é um fator de " + n); // comando é ignorado
    }
}
