package capitulo05;

public class BubbleString {
    public static void main(String[] args) {
        String classificar[] = {"Capacete", "Machado", "Peitoral", "Poção", "Calça", "Bolsa"};

        int a, b;
        String t;
        int size;

        size = classificar.length;
    
        System.out.print("Array original é: ");
        for(int i =0; i < size; i++){
            if(i == 0){
                System.out.print(classificar[i]);
            }else if(i == 5){
                System.out.print(", " + classificar[i] + ".");
            }else
                System.out.print(", " + classificar[i]);
        }    
        System.out.println();

        for(a=1; a < size; a++)
            for(b = size - 1; b >= a; b--){
                if(classificar[b-1].compareTo(classificar[b]) > 0 ) {
                    t = classificar[b-1];
                    classificar[b-1] = classificar[b];
                    classificar[b] = t;
                }
            }
        System.out.print("Array classificado: ");
        for(int i=0; i < size; i++)
            if(i == 0){
                System.out.print(classificar[i]);
         }else if(i == 5){
                System.out.print(", " + classificar[i] + ".");
            }else
                System.out.print(", " + classificar[i]);   
    }
}

