package capitulo1;

/**
 * Revisao dos aprendizados até aqui, capitulo 1 
 */
public class Revisao {

    public static void main(String[] args) {
        double numero1, porcentagem, resultado;
        int contador;

        numero1= 100;
        
        contador=0;

        for(porcentagem=10; porcentagem <= 100;porcentagem = porcentagem + 10){
            porcentagem = porcentagem / 100;
            resultado = numero1 * porcentagem;

            porcentagem = porcentagem * 100;
            System.out.println(porcentagem+"% de " + numero1 +" é "+ resultado + ".");

            contador++;

            if(contador == 5){
                System.out.println();
                contador = 0;
            } 

        }
    }
}