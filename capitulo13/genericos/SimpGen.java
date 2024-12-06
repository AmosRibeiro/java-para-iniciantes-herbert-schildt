package capitulo13.genericos;

public class SimpGen {
    public static void main(String[] args) {
        
        TwoGen<Integer, String> tgObj = new TwoGen<Integer,String>(88, "Generics");

        tgObj.ShowTypes();

        int v = tgObj.getOb1();
        System.out.println("value: " + v);

        String str = tgObj.getOb2();
        System.out.println("value: " + str);
    }
}
