package capitulo5;

// Resposta oficial do exercicio de encode.
public class Encode3 {
    public static void main(String[] args) {
        String msg = "Isso é um teste";
        String enmsg = "";
        String decmsg = "";
        String key = "abcdefgi";
        int j;

        System.out.print("Mensagem original: ");
        System.out.println(msg);

        j=0;
        for(int i=0; i < msg.length(); i++)
            enmsg = enmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if(j==8) j = 0;

        System.out.print("Mensagem codificada: ");
        System.out.println(enmsg);

       j = 0;
        for(int i=0; i < msg.length(); i++) 
            decmsg = decmsg + (char) (enmsg.charAt(i) ^ key.charAt(j));
            j++;
            if(j==8) j = 0;

        System.out.print("Mensagem decodificada: ");
        System.out.println(decmsg);
    }
}
