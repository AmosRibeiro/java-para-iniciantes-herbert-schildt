package capitulo6.queuev3;

public class Queuev3 {
    private char q[]; //esse array contém a fila
    private int putloc, getloc; // índices put e get

    // Constrói uma fila vazia dado seu tamanho.
    Queuev3(int size) {
        q = new char[size]; //aloca memória para a fila
        putloc = getloc = 0;
    }

    // Constrói uma fila a partir de outra.
    Queuev3(Queuev3 ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // Copia elementos.
        for(int i = getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }

    // Constrói uma fila com valores iniciais.
    Queuev3(char a[]){
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for(int i = 0; i < a.length; i++) put (a[i]);
    }

    // Insere um caractere na fila.
    void put(char ch) {
        if(putloc==q.length){
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    // Obtém um caractere na fila.
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}
