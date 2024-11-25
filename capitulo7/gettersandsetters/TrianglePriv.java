package capitulo7.gettersandsetters;

public class TrianglePriv extends TwoDShapePrivate{

    String style;

    double area(){
        return getWidth() * getHeight() /2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}