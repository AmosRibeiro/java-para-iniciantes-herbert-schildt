package capitulo7.superconstructor;


public class Shapes3 {
    public static void main(String[] args) {
        
        TriangleSuperConstruc t1 = new TriangleSuperConstruc("filled", 4.0, 4.0);
        TriangleSuperConstruc t2 = new TriangleSuperConstruc("outlined", 8.0, 12.0);

        t1.setWidth(4.0);
        t1.setHeight(4.0);
   

        t2.setWidth(8.0);
        t2.setHeight(12); 


        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }
}
