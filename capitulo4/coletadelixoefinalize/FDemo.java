package capitulo4.coletadelixoefinalize;

public class FDemo {
    int x;

    FDemo (int i){
        x = i;
    }

    //chamada quando o objeto é reciclado
    protected void finalize(){
        System.out.println("Finalizando " + x);
    }

    //gera um objeto que é imediatamente destruído
    void generator(int i ){
        FDemo o = new FDemo(i);
    }
}