/*
 * Um sistema de ajuda simples
 */
public class Help {
    public static void main(String[] args) 
        throws java.io.IOException{
            char choice;

            System.out.println("Você precisa de ajuda com:");
            System.out.println("   1. if");
            System.out.println("   2. switch");
            System.out.println("Escolha um: ");
            choice = (char) System.in.read();

            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("O if:\n");
                    System.out.println("if(condição) instrução;");
                    System.out.println("else intrução;");
                    break;
                case '2':
                    System.out.println("O switch:\n");
                    System.out.println("switch(expressão){");
                    System.out.println("  case constante:");
                    System.out.println("    sequencia de instrução");
                    System.out.println("     break;");
                    System.out.println(" // ...");
                    System.out.println("}");
                    break;
                default:
                   System.out.println("Opção selecionada inválida.");
            }
        
    }
}
