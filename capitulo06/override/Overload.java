package capitulo06.override;

// Demonstra a sobrecarga de métodos.
public class Overload {
    void ovlDemo() {//primeira versao
    System.out.println("Sem parâmetros.");
    }

    void ovlDemo(int a){
        System.out.println("Um parâmetro: " + a);
    }
    
    int ovlDemo(int a, int b){
        System.out.println("Dois parâmetros: " + a + " " + b);
        return a + b;
    }

    double ovlDemo (double a, double b){
        System.out.println("Dois parâmetros do tipo double: " + a + " " + b);

        return a + b;
    }
}
