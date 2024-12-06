package capitulo13.genericos;

public class GenDemo {
    public static void main(String[] args) {
        
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);

        iOb.ShowType();

        int v = iOb.getOb();
        System.out.println("value: " + v);
        
        System.out.println();

        Gen<String> strOb = new Gen<String>("Generic test.");

        strOb.ShowType();

        String str = strOb.getOb();
        System.out.println("value: " + str);
    }
}
