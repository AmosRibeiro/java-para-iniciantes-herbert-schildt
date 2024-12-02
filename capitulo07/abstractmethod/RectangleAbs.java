package capitulo07.abstractmethod;

public class RectangleAbs  extends TwoDShapeAbs{
    
    RectangleAbs(){
        super();
    }

    RectangleAbs(double w, double h){
        super(w, h, "rectangle");
    }

    RectangleAbs(double x){
        super(x, "rectangle");
    }

    RectangleAbs(RectangleAbs ob){
        super(ob);
    }

    boolean isSquare(){
        if(getWidth() == getHeight()) return true;
        return false;
    }

    double area(){
        return getWidth() * getHeight();
    }
}
