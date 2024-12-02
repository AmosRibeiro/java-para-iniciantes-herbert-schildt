package capitulo01;

public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 3;

        if(a < b) System.out.println("A é menor que B."); 
        


        if(a == b) System.out.println("Você não verá isso."); //esta instrução não será exibida

        System.out.println();

        c = a - b; // c contém -1

        System.out.println("C contém o valor de -1.");
        if(c >= 0) System.out.println("C não é um valor negativo.");
        if(c <0) System.out.println("C é um valor negativo.");

        c = b - a; //c contém 1

        System.out.println("C contém o valor de 1.");
        if(c >= 0) System.out.println("C não é um valor negativo.");
        if(c <0) System.out.println("C é um valor negativo.");
    }
    
}
