package capitulo05;

public class CLDemo {
    public static void main(String args[]) {
        System.out.println("Existem "+ args.length + " argumentos de linha de comando.");

        System.out.println("Eles são: ");
        for(int i=0; i< args.length; i++)
        System.out.println("arg["+ i + "]: " + args[i]);
    }
}