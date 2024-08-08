public class Primos {
    public static void main(String[] args) {
        int dividendo, divisor, contador;
        boolean ePrimo;
        
        contador = 0;
        for(dividendo = 2; dividendo <= 100 ; dividendo++){
            ePrimo = true;
           
            for(divisor = 2; divisor <= dividendo/divisor; divisor++)
                if((dividendo%divisor) == 0) ePrimo = false;

                if(ePrimo){
                System.out.println(dividendo + " é um número primo.");
                contador++;
                System.out.println("O total de números primos de 2 a 100 é de " + contador);
            }
        }
            
    }
}

