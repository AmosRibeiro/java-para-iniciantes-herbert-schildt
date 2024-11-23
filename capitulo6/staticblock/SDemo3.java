package capitulo6.staticblock;

public class SDemo3 {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Dentro do construtor.");

        System.out.println("Raiz quadrada de 2 é " + StaticBlock.rootOf2);
        System.out.println("Raiz quadrada de 3 é " + StaticBlock.rootOf3);
        ob.getClass(); // Só para usar o ob.
    }
}
