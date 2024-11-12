package capitulo3;

//Escrever um programa que converte letras ASCII minusculas em maiusculas e caso escreva letras minisculas converte-las em maiusculas e contar quantas alteracoes ocorreram, o programa finaliza com ponto.
public class ConverteMaiuscEmMinus {
    public static void main(String[] args) throws java.io.IOException {
        char usuarioDigitacao, charConvertido;
        int i = 0, charEmDecimal;
        String mostraTextoConvertido = new String();   

        System.out.println("Escreva um texto, ao escrever um ponto final o programa será encerrado e todas as letras minusculas serao convertidas em maiusculas e serao exibidas quantas " 
        + "alterações foram feitas.");

        do{
            usuarioDigitacao = (char) System.in.read();

            charEmDecimal = (int)usuarioDigitacao;
           if(charEmDecimal >= 97 && charEmDecimal <= 122){ charEmDecimal = (charEmDecimal -32); i++;
           }else if(charEmDecimal >= 65 && charEmDecimal <= 90){ charEmDecimal = (charEmDecimal + 32); i++;
           }
        charConvertido = (char)charEmDecimal;

        mostraTextoConvertido = mostraTextoConvertido + charConvertido; 
        } while(charEmDecimal != 46);
        System.out.print( mostraTextoConvertido + " O número de modificaçõe foi de " + i);
        }
    }

//Minusculas tem um range de 97 a 122 sendo 97 a minusc. e 122 z minusc.
//Maiusculas tem um range de 65 a 90 sendo 65 A maiusc. e 90 Z maiusc.