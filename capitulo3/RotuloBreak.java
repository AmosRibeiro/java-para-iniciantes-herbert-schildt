package capitulo3;

public class RotuloBreak {
    public static void main(String[] args) {
        int i;

        for(i = 1; i<4 ; i++){
            one: {
                two: {
                    three: {
                        System.out.println("\ni é " + i);
                        if( i == 1) break one;
                        if( i == 2) break two;
                        if( i == 3) break three;
                    }
                    System.out.println("Após bloco três.");
                }
                System.out.println("Após bloco dois.");
            }
            System.out.println("Após bloco um.");
        }
        System.out.println("Após o fim de for.");
    }
}
