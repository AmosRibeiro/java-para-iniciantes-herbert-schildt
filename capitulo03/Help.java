package capitulo03;

/*
 * Um sistema de ajuda simples versão 3
 */
public class Help {
    public static void main(String[] args) 
        throws java.io.IOException{
            char choice, ignore;

            for(; ;){
                do {
            System.out.println("Você precisa de ajuda com:");
            System.out.println("   1. if");
            System.out.println("   2. switch");
            System.out.println("   3. for");
            System.out.println("   4. while");
            System.out.println("   5. do-while");
            System.out.println("   6. break");
            System.out.println("   7. continue\n");
            System.out.println("Escolha uma opção ou pressione q para sair: ");

            choice = (char) System.in.read();

            
            do {
                ignore = (char) System.in.read();
               } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if(choice == 'q') break;

            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("Estrutura básica da instrução if:\n");
                    System.out.println("if(condição) instrução;");
                    System.out.println("else intrução;");
                    break;
        
                case '2':
                    System.out.println("Estrutura básica da instrução switch:\n");
                    System.out.println("switch(expressão){");
                    System.out.println("  case constante:");
                    System.out.println("    sequência de instrução");
                    System.out.println("     break;");
                    System.out.println(" // ...");
                    System.out.println("}");
                    break;

                case '3':
                    System.out.println("Estrutura básica do laço for:\n");
                    System.out.print("for(inicialização; condição; iteração);");
                    System.out.println(" instrução;");
                    break;

                case '4':
                    System.out.println("Estrutura básica do laço while:\n");
                    System.out.println("while(condição) instrução;");
                    break;

                case '5':
                    System.out.println("Estrutura básica do laço do-while:\n");
                    System.out.println("do {");
                    System.out.println(" instrução;");
                    System.out.println("} while (condição);");
                    break;

                case '6':
                    System.out.println("Estrutura básica do break:\n");
                    System.out.println("break; ou break rótulo;");
                    break;

                case '7':
                    System.out.println("Estrutura básica do continue:\n");
                    System.out.println("continue; ou continue rótulo;");
                    break;
            }
        System.out.println();
        }
    }
}
