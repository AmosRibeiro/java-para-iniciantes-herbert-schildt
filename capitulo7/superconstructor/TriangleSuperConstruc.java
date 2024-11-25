package capitulo7.superconstructor;

public class TriangleSuperConstruc extends TwoDShape3{
    private String style;

    TriangleSuperConstruc(String s, double w, double h){
        super(w, h); // Chama o construtor da superclasse

        style = s;
    }

    double area(){
        return getWidth() * getHeight() /2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
