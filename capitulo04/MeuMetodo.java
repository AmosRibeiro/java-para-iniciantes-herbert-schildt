package capitulo04;

class MeuMetodo{

    void myMeth(){
        int i;

        for(i = 0; i<10; i++){
            if( i == 5) return;
            System.out.println(i);
        }
    }
public static void main(String[] args) {
    MeuMetodo oi = new MeuMetodo();

    oi.myMeth();
}
}