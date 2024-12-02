package capitulo05;

public class LengthDemo {
    public static void main(String[] args) {
        int list[] = new int [10];
        int nums[] = { 1, 2, 3};
        int table[][] = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        System.out.println("Tamanho da list é de " + list.length);
        System.out.println("Tamanho de nums é de " + nums.length);
        System.out.println("Tamanho da table é de " + table.length);
        System.out.println("Tamanho da table[0] é de " + table[0].length);
        System.out.println("Tamanho da table[1] é de " + table[1].length);
        System.out.println("Tamanho da table[2] é de " + table[2].length);
        System.out.println();

        //usa length para inicializar uma list
        for(int i=0; i < list.length; i++)
        list[i] = i * i;

        System.out.print("Aqui está a lista: ");
        //Usa length para exibir list
        for(int i=0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();     
    }
}
