  /*
     * Calcula quantas polegadas cúbicas há em uma milha
     * cúbica.
     */
public class ExemploDeLong {
    public static void main(String[] args) {
        long ci;
        long im;

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("Tem " + ci + " polegadas cúbicas em um milhar cúbico.");
    }
} 