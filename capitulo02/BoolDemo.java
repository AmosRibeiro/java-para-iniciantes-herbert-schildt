package capitulo02;

public class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b= false;
        System.out.println("b é " + b);
        b= true;
        System.out.println("b é " + b);

        //um valor booleano pode controlar a instrução if
        if(b) System.out.println("Isso é executado.");

        b=false;
        if(b) System.out.println("Isso não é executado.");

        // O resultado de um operador relacional é um valor booleano.
        System.out.println("10 > 9 é " + (10 > 9));
    }
}
