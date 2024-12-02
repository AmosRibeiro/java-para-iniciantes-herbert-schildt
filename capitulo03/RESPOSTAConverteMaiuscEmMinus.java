package capitulo03;

// a forma que respondi pode ser encontrada no arquivo ConverteMaiuscEmMinus.java, essa é a resposta dada pelo livro em que o código é mais simples.
public class RESPOSTAConverteMaiuscEmMinus {
    public static void main(String[] args) throws java.io.IOException{
        char ch;
        int changes = 0;
    
        System.out.println("Digite um ponto final para parar.");

        do {
            ch  = (char) System.in.read();
            if(ch >= 'a' & ch <= 'z'){
                ch -= 32;
                changes++;
                System.out.println(ch);
            }
            else if(ch >= 'A' & ch <= 'Z'){
                ch += 32;
                changes++;
                System.out.println(ch);
            }
        } while (ch != '.');
        System.out.println("Foram alteradas:" + changes);
    }
}
