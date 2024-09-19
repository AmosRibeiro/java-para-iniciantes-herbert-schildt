package capitulo5;

public class Bolha {
    //Classificação de array por bolha
    public static void main(String[] args) {
        int nums[] = { 3192, 3213, 442, 219, -200, 44, 9999, 666, -333, 9283};

        int a, b, t;
        int size;

        size = 10; // número de elementos a serem classificados

        //exibe a array original.
        System.out.print("Array original: ");
        for(int i= 0; i < size; i++)
            System.out.print(" " + nums[i]);
            System.out.println();
        
        //esta é a classificação pro bolha
        for(a = 1; a < size; a++)
        for(b=size-1; b >= a; b--){
            if(nums[b-1] > nums[b]) { //se fora de ordem troca de elementos
                t = nums[b-1];
                nums[b-1] = nums[b];
                nums[b] = t;
            }
        }
        //exibe o array classificado
        System.out.print("Array classificado é: ");
        for(int i = 0; i < size; i++)
        System.out.print(" " + nums[i]);
        System.out.println();
    }
}
