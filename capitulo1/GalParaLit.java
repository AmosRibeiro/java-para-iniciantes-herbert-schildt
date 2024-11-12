package capitulo1;
/* 
    Tente isto 1-1

    Este programa converte galões em litros.

*/
public class GalParaLit {
    public static void main (String args[]){
        double galoes; //número de galões
        double litros; //conversão para litros

        galoes = 10; 
        litros = galoes * 3.7854;

        System.out.println(galoes + " galões é igual a " + litros + " litros.");
    }
}