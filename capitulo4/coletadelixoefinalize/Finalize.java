package capitulo4.coletadelixoefinalize;

public class Finalize {
    public static void main(String[] args) {
        int count;

        FDemo ob = new FDemo(0);

        /* Agora, gere um grande número de objetos.
         * Em algum momento, a coleta de lixo ocorrerá.
         * Nota: você pode ter de aumentar o número
         * de objetos gerados para forçar a
         * coleta de lixo*/

        for(count=1; count < 1000000000; count++)
        ob.generator(count);
    }
}