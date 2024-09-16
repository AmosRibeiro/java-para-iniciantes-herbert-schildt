package capitulo4.veiculo;

public class Veiculo {
    int passageiros;
    int capacidadeCombustivel;
    int consumo;

    void alcance(){
        System.out.println(" E seu alcance é de " + capacidadeCombustivel * consumo + ".");
    }
}
