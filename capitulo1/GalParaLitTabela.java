package capitulo1;
/* 
 * Tente isto 1-2
 * Este programa exibe uma tabela de
 * conversões de galões em litros.
*/

public class GalParaLitTabela {
    public static void main(String[] args) {
        double galoes, litros;
        int contador;

        contador = 0;
        for(galoes = 1; galoes <= 100; galoes++){
            litros = galoes * 3.7854; //converte para litros
            System.out.println(galoes + " galões é igual a " + litros + " litros.");

            contador++;
            //a cada décima linha, exibe uma linha em branco
            if(contador == 10){
                System.out.println();
                contador = 0; //zera o contador de linhas
            }
        }

    }
    
}
