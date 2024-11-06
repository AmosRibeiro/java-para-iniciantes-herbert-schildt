package capitulo5.cofre;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        
        if (tipoCofre.equalsIgnoreCase("digital")) {
        int senhaCofre = scanner.nextInt();
        int confirmarSenha = scanner.nextInt();
        CofreDigital cofre = new CofreDigital(senhaCofre);
        cofre.imprimirInformacoes();
        cofre.validarSenha(confirmarSenha);
        }
        if (tipoCofre.equalsIgnoreCase("fisico")){
        Cofre cofreFisico = new CofreFisico();
        cofreFisico.imprimirInformacoes();
        }
        scanner.close();
    }
}
