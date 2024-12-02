package capitulo06.queuev3;

public class QDemov2 {
    public static void main(String[] args) {
        // Constrói uma fila vazia para 10 elementos.
        Queuev3 q1 = new Queuev3(10);

        char name[] = {'T', 'o', 'm'};
        // Constrói uma fila a partir do array.
        Queuev3 q2 = new Queuev3(name);

        char ch;
        int i;

        // Insere alguns caracteres em q1.
        for(i = 0; i < 10; i++)
        q1.put((char) ('A' + i));

        // Constrói uma fila a partir de outra.
        Queuev3 q3 = new Queuev3(q1);

        // Exibe as filas
        System.out.print("Conteúdos de q1: ");
        for( i = 0; i < 10; i++){
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Conteúdos de q2: ");
        for(i = 0; i < 3; i++){
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Conteúdos de q3: ");
        for(i = 0; i < 10; i++){
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
