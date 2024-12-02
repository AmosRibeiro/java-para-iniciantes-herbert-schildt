package capitulo07.sobremet;

public class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2 , 3);
 
        subOb.show("This is k: "); // Chama show() em B
        subOb.show(); // Chama show() em A
    }
}
