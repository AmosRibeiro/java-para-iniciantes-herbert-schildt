public class RaizQuadrada {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for(num = 1.0; num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("A raiz quadrada de " + num + " é " + sroot);

            // calcula o erro de arredondamento
            rerr = num - (sroot * sroot);
            System.out.println("Erro de arrendondamento é de " + rerr);
            System.out.println();
        }
    }
    
}
