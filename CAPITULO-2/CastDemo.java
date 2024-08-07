// Demonstra a coerção.
public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // converte double em int, ocorrerá truncamento nessa conversão.
        System.out.println("Inteiro resultante de x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Valor de b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Valor de b: " + b);

        b = 88; // ASCII para X

        ch = (char) b;
        System.out.println("Ch: " + ch);
    }
}
