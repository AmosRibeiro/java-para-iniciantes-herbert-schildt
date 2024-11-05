package capitulo5;

// Usa XOR para codificar e decodificar uma mensagem.
public class Encode {
    public static void main(String[] args) {
        String msg = "Somente você pode fazer isso.";
        String enmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Mensagem original: ");
        System.out.println(msg);

        // codifica a mensagem.
        for(int i=0; i < msg.length(); i++)
            enmsg = enmsg + (char) (msg.charAt(i) ^ key);

        System.out.print("Mensagem codificada: ");
        System.out.println(enmsg);

        // decodifica a mensagem.
        for(int i=0; i < msg.length(); i++) 
            decmsg = decmsg + (char) (enmsg.charAt(i) ^ key);

        System.out.print("Mensagem decodificada: ");
        System.out.println(decmsg);
    }
}
