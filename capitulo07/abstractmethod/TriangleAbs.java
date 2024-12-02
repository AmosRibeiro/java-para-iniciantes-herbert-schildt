package capitulo07.abstractmethod;

public class TriangleAbs extends TwoDShapeAbs {
    private String style;

    TriangleAbs(){
        super();
        style = "none";
    }

    TriangleAbs(String s, double w, double h){
        super(w, h, "triangle");

        style = s;
    }

    TriangleAbs(double x){
        super(x, "triangle");
        style = "filled";
    }

    TriangleAbs(TriangleAbs ob){
        super(ob);
        style = ob.style;
    }

    double area(){
        return getWidth() * getHeight() /2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
