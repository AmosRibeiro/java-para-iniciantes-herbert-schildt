package capitulo06.fibonacci;

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
        
        for(int i = 0, b = 1, c = 2; c < fibo.length ; c++){
            fibo[c] = fibo[i] + fibo[b];
            i++;
            b++;
        }
        System.out.println(Arrays.toString(fibo));
        System.out.print("Type a number to verify if it belong to fibonacci sequence in the range between 1 and 6765: ");
        inputNum = sc.nextInt();
        
        if(inputNum <= 0 || inputNum > 6765){
            System.out.println("Invalid number, type a number in the range between 1 and 6765.");
            isFibo = true;
        } 
        else{
            for(int c : fibo) // Percorre o Array todo e vai colocando o valor dele na variavel c.
                if(inputNum == c){ // Verifica se o input está contido no array.
                    System.out.println("Congratulations, the number " + inputNum + " it's a fibo number!");
                    isFibo = true;
                    break;
                }
        }
        if(isFibo == false){
            System.out.println("Sorry, " + inputNum + " isn't a fibo.");
        }
        sc.close();
    }
}
