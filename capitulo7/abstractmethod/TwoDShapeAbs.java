package capitulo7.abstractmethod;


abstract class TwoDShapeAbs {

    private double width;
    private double height;
    private String name;


    
    TwoDShapeAbs(){
        width = height = 0.0 ;
        name = "none";
    }

    TwoDShapeAbs(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }

    TwoDShapeAbs(double x, String n){
        width = height = x;
        name = n;
    }

    TwoDShapeAbs(TwoDShapeAbs ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth(){ return width;}
    double getHeight(){ return height;}
    void setWidth(double w ){ width = w;}
    void setHeight(double h){ height = h;}

    String getName() { return name;}

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }

    abstract double area();
}
