package capitulo07.abstractmethod;

public class Circle extends TwoDShapeAbs{
    final double PI = 3.14;
    double raio;
    


    Circle(){
        super();
    }

    Circle(double PI, double r){
        super(PI, r, "Circle");
    }

    Circle(double x){
        super(x, "Circle");
    }

    Circle(Circle ob){
        super(ob);
    }

    double area(){
        return getWidth() * getHeight() /2;
    }
}
