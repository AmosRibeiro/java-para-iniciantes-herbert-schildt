package capitulo07.superconstructor;

public class TwoDShape3 {
    private double width;
    private double height;


    TwoDShape3(double w, double h){ // Construtor.
        width = w;
        height = h;
    }

    double getWidth(){ return width;}

    double getHeight(){ return height;}

    void setWidth(double w){ width = w;}

    void setHeight(double h){ height = h;}

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
}
