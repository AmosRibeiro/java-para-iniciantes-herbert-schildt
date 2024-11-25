package capitulo7.heranca;

public class Triangles extends TwoDShape {
    String style;

    double area(){
        return width * height /2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
