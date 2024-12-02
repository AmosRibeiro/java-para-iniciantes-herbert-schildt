package capitulo07.gettersandsetters;

public class TwoDShapePrivate {
    private double width;
    private double height;


    // Métodos acessadores para width(private) e height(private) Getters and Setters.
    double getWidth(){ return width;}

    double getHeight(){ return height;}

    void setWidth(double w){ width = w;}

    void setHeight(double h){ height = h;}

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
}
