package capitulo07.abstractmethod;

public class AbsShape {
    public static void main(String[] args) {
        TwoDShapeAbs shapes[] = new TwoDShapeAbs[4];

        shapes[0] = new TriangleAbs("outlined", 8.0, 12.0);
        shapes[1] = new RectangleAbs(10);
        shapes[2] = new RectangleAbs(10, 4);
        shapes[3] = new TriangleAbs(7.0);

        for(int i = 0; i < shapes.length; i ++){
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());

            System.out.println();
        }
    }
}
