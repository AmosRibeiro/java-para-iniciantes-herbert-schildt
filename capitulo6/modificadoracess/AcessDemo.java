package capitulo6.modificadoracess;

public class AcessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        /* O acesso a alpha só é perimitido por intermédio
         * de seus métodos acessadores.
         */
        ob.setAlpha(-99);
        System.out.println("ob.alpha é " + ob.getAlpha());

        // Você não pode acessar alpha dessa forma:
    // ob.alpha = 10; // Errado! alpha é privado!
        
        //Essas linhas estão corretas porque beta e gamma são públicos.
        ob.beta = 88;
        ob.gamma = 99;
    }
}
