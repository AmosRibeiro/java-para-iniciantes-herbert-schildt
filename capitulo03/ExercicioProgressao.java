package capitulo03;

//Programa que use um laço for para gerar e exibir a progressão 1 , 2, 4, 8, 16, 32
public class ExercicioProgressao {
    public static void main(String[] args) {
        for(int i = 1, j = 2; i <= 32; i = i *j ) System.out.println(i);
    }
}
