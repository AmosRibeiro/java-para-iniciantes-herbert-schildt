    /* 
 * 
 * Este programa exibe uma tabela de
 * conversões de polegadas em metros.
*/
public class ConversaoPolegadasEmMetros {
    public static void main(String[] args) {
        double metros, polegadas;
        int contador;

        contador = 0;
        for(polegadas = 1; polegadas <= 144; polegadas++){
            metros = polegadas / 39.37 ; //converte para polegadas
            System.out.println(polegadas + " polegada(s) é igual a " + metros + " metro(s).");

            contador++;
    
            //a cada décima segunda, exibe uma linha em branco
            if(contador == 12){
                System.out.println();
                contador = 0; //zera o contador de linhas
            }
        }

    }
    
}

