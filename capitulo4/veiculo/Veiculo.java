package capitulo4.veiculo;

public class Veiculo {
    int passageiros;
    int capacidadeCombustivel;
    int consumo;

    void alcance(){
        System.out.println(" O alcance é de " + capacidadeCombustivel * consumo);
    }
}
