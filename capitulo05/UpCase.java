package capitulo05;

// Programa que transforma letras minúsculas em maiúsculas pela redefinição do 6º bit com 0.
public class UpCase {
    public static void main(String[] args) {
        char ch;

        for(int i=0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            // Essa instrução desativa o 6º bit.
            ch = (char) ((int) ch & 65503); // agora ch é maiúscula.

            System.out.print(ch + " ");
        }
    }
}
