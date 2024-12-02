package capitulo03;

public class EmptyPartsFor {
    public static void main(String[] args) {
        int i;

        i = 0; // Move a inicialização para fora do laço
        for(; i <10; ){
        System.out.println("Pass #" + i);
        i++; //incrementa a variável de controle de laço
        }
    }
}
