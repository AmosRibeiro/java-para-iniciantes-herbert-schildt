package capitulo5;

// Podemos fazer uso do OR de bitwise para alterar o programa de conversao de maisuculas em minusculas.
public class LowCase {
    public static void main(String[] args) {
        char ch;
        for(int i=0; i<10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);
        // Essa instrução ativa o 6º bit.
        ch = (char) ((int) ch | 32); // agora ch é minúscula.
        
        System.out.print(ch + " ");
       }
    }
}
