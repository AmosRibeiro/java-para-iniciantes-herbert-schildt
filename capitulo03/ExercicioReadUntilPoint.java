package capitulo03;

//Desafio: escrever um programa que leia caracteres do teclado até um ponto ser recebido. Faça-o contar o número de espaços. Relate o total no fim do programa.
public class ExercicioReadUntilPoint {
    public static void main(String[] args) throws java.io.IOException {
        char usuarioDigitacao, contaEspaço = ' ', pontoParada = '.';
        int i = 0;

        System.out.println("Escreva um texto, ao escrever um ponto final o programa será encerrado e o número de espaços utilizados será exibido.");

        do{
            usuarioDigitacao = (char) System.in.read();

           if(usuarioDigitacao == contaEspaço) i++;
           
        } while(usuarioDigitacao != pontoParada);
        System.out.print("O programa foi encerrado e possui " + i + " espaços.");
        }
    }