package capitulo5;

// Codificando uma mensagem com String.
public class Encode2 {
    public static void main(String[] args) {
        String msg = "Somente";
        String enmsg = "";
        String decmsg = "";
        String key = "CHAVECRI";

        System.out.print("Mensagem original: ");
        System.out.println(msg);

     
        for(int i=0; i < msg.length(); i++)
            enmsg = enmsg + (char) (msg.charAt(i) ^ key.charAt(i));

        System.out.print("Mensagem codificada: ");
        System.out.println(enmsg);

       
        for(int i=0; i < msg.length(); i++) 
            decmsg = decmsg + (char) (enmsg.charAt(i) ^ key.charAt(i));

        System.out.print("Mensagem decodificada: ");
        System.out.println(decmsg);
    }
}
