package capitulo4.veiculo;

public class Veiculo {
    int passageiros;
    int capacidadeCombustivel;
    int consumo;

    int alcance(){
        return consumo * capacidadeCombustivel;
    }

    double combustivelNecessario(int kilometros){
        return (double) kilometros / consumo;
    }
}
