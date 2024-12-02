package capitulo06.staticdemo;

public class StaticDemo {
    int x; // Variável de instância comum.
    static int y; // Variável estática.

    int sum(){
        return x + y;
    }
    static int sub(){ // Método estático, só pode acessar diretamente dados static.
        return y - 1;
    }
}
