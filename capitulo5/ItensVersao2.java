package capitulo5;

public class ItensVersao2 {
    public static void main(String[] args) {
        int i;
        String classesRPG[] = {"Bárbaro", "Bardo", "Guerreiro", "Arqueiro", "Mago", "Bruxo", "Ladino", "Clérigo", "Druida", "Monge"};
        
        System.out.println("As classes disponiveis são: ");
        for(i = 0; i < 10; i++)
        if(i < 9){
        System.out.print(classesRPG[i] + ", ");
        } else System.out.print(classesRPG[i] + ".");
    }
}
