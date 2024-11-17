package capitulo6.subirnivel;

import java.util.Scanner;

public class Atributos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int atributos[] = {15, 15, 15, 15, 15, 15}; // Atributos iniciais.
        int nivel = 1; // Nível inicial.
        int uparXNiveis = 19; // Controlamos quantos niveis queremos upar. 
        int pontosDisponiveis = 0; // Pontos disponiveis para distribuir nos atributos.      

        System.out.println("Nivel " + nivel + "\n" + "FORÇA: " + atributos[0]);
        System.out.println("VIGOR: " + atributos[1]);
        System.out.println("DESTREZA: " + atributos[2]);
        System.out.println("INTELIGÊNCIA: " + atributos[3]);
        System.out.println("SORTE: " + atributos[4]);
        System.out.println("CARISMA: " + atributos[5]);
        
        for(int xp = 0; xp < uparXNiveis; xp++){
            for(int i = 0; i < atributos.length; i ++)
                atributos[i] += 1;
                nivel++;
                pontosDisponiveis += 3;

                System.out.println("Subiu de nivel");            
                System.out.println("==============================================");
                System.out.println("Nivel " + nivel + "\n" + "FORÇA: " + atributos[0]);
                System.out.println("VIGOR: " + atributos[1]);
                System.out.println("DESTREZA: " + atributos[2]);
                System.out.println("INTELIGÊNCIA: " + atributos[3]);
                System.out.println("SORTE: " + atributos[4]);
                System.out.println("CARISMA: " + atributos[5]);
                System.out.println("==============================================");

            
        } 
        
        while(pontosDisponiveis > 0){
            System.out.println("Pontos disponíveis para distribuir: "+ pontosDisponiveis);
            System.out.println("Distribua seus pontos!!");
            System.out.println("0 -> +1 de Força");
            System.out.println("1 -> +1 de Vigor");
            System.out.println("2 -> +1 de Destreza");
            System.out.println("3 -> +1 de Inteligência");
            System.out.println("4 -> +1 de Sorte");
            System.out.println("5 -> +1 de Carisma");
            System.out.println("Escolha o atributo: ");

            int escolhaDoAtributo = sc.nextInt();
            
            switch (escolhaDoAtributo) {
                case 0:
                    atributos[0] += 1;
                    pontosDisponiveis--;
                    System.out.println("Nivel " + nivel + "\n" + "FORÇA: " + atributos[0] + " você se sente mais forte.");
                    System.out.println("VIGOR: " + atributos[1]);
                    System.out.println("DESTREZA: " + atributos[2]);
                    System.out.println("INTELIGÊNCIA: " + atributos[3]);
                    System.out.println("SORTE: " + atributos[4]);
                    System.out.println("CARISMA: " + atributos[5]);
                    break;
                
                case 1:
                    atributos[1] += 1;
                    pontosDisponiveis--;
                    System.out.println("Nivel " + nivel + "\n" + "FORÇA: " + atributos[0]);
                    System.out.println("VIGOR: " + atributos[1] + " você se sente mais energético.");
                    System.out.println("DESTREZA: " + atributos[2]);
                    System.out.println("INTELIGÊNCIA: " + atributos[3]);
                    System.out.println("SORTE: " + atributos[4]);
                    System.out.println("CARISMA: " + atributos[5]);
                    break;
                
                case 2:
                    atributos[2] += 1;
                    pontosDisponiveis--;
                    System.out.println("Nivel " + nivel + "\n" + "FORÇA: " + atributos[0]);
                    System.out.println("VIGOR: " + atributos[1]);
                    System.out.println("DESTREZA: " + atributos[2] + " você se sente mais veloz.");
                    System.out.println("INTELIGÊNCIA: " + atributos[3]);
                    System.out.println("SORTE: " + atributos[4]);
                    System.out.println("CARISMA: " + atributos[5]);
                    break;
                
                case 3:
                    atributos[3] += 1;
                    pontosDisponiveis--;
                    System.out.println("Nivel " + nivel + "\n" + "FORÇA: " + atributos[0]);
                    System.out.println("VIGOR: " + atributos[1]);
                    System.out.println("DESTREZA: " + atributos[2]);
                    System.out.println("INTELIGÊNCIA: " + atributos[3] + " você se sente mais inteligente.");
                    System.out.println("SORTE: " + atributos[4]);
                    System.out.println("CARISMA: " + atributos[5]);
                    break;
                
                case 4:
                    atributos[4] += 1;
                    pontosDisponiveis--;
                    System.out.println("Nivel " + nivel + "\n" + "FORÇA: " + atributos[0]);
                    System.out.println("VIGOR: " + atributos[1]);
                    System.out.println("DESTREZA: " + atributos[2]);
                    System.out.println("INTELIGÊNCIA: " + atributos[3]);
                    System.out.println("SORTE: " + atributos[4] + " você se sente mais sortudo.");
                    System.out.println("CARISMA: " + atributos[5]);
                    break;
                
                case 5:
                    atributos[5] += 1;  
                    pontosDisponiveis--;
                    System.out.println("Nivel " + nivel + "\n" + "FORÇA: " + atributos[0]);
                    System.out.println("VIGOR: " + atributos[1]);
                    System.out.println("DESTREZA: " + atributos[2]);
                    System.out.println("INTELIGÊNCIA: " + atributos[3]);
                    System.out.println("SORTE: " + atributos[4]);
                    System.out.println("CARISMA: " + atributos[5] + " você se sente mais carismático.");
                    break;  

                default:
                    System.out.println("Escolha inválida. Escolha uma opção de 0 a 5.");
                    break;
            }
        }
        sc.close();
        System.out.println("==============================================");
        System.out.println("=============STATUS DO PERSONAGEM=============");
        System.out.println("==============================================");
        System.out.println("Nivel " + nivel + "\n" + "FORÇA: " + atributos[0]);
        System.out.println("VIGOR: " + atributos[1]);
        System.out.println("DESTREZA: " + atributos[2]);
        System.out.println("INTELIGÊNCIA: " + atributos[3]);
        System.out.println("SORTE: " + atributos[4]);
        System.out.println("CARISMA: " + atributos[5]);
        System.out.println("==============================================");
        System.out.println("==============================================");
    }
}
