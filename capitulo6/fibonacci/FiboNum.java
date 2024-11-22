package capitulo6.fibonacci;

import java.util.Arrays;
import java.util.Scanner;

// Tente fazer uma sequência de Fibonacci, numeros naturais começa com 1 e 1 e o proximo numero sempre e a soma dos dois anteriores.
// Depois faça o usuario digitar um numero e verifique se pertence a sequência de Fibonacci.
public class FiboNum {
    public static void main(String[] args) {
        int fibo[] = new int [20];
        fibo[0] = 1;
        fibo[1] = 1;
        Scanner sc = new Scanner(System.in);
        int inputNum;
        boolean isFibo = false;
        
        for(int i = 0, b = 1, c = 2; c < 20 ; c++){
            fibo[c] = fibo[i] + fibo[b];
            i++;
            b++;
        }
        System.out.println(Arrays.toString(fibo));

        inputNum = sc.nextInt();
        
        if(inputNum <= 0 || inputNum > 6765){
            System.out.println("Invalid number, digit something in the range between 1 and 6765.");
            isFibo = true;
        } else{
            
            for(int c = 0; c < 20; c++)
            if(inputNum == fibo[c]){
                System.out.println("Congratulations, is a fibo number!");
                isFibo = true;
                break;
            }
        }
        if(isFibo == false){
            System.out.println("Your number isn't a fibo, sorry.");
        }
    }
}
