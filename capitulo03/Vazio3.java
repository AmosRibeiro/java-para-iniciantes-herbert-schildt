package capitulo03;

public class Vazio3 {
    public static void main (String args[]){
        int i;
        int sum = 0 ;

        //somas os numeros até 5
        for(i = 1 ; i <= 5 ; sum += i++);

        System.out.println("Soma é " + sum);
    }
}
