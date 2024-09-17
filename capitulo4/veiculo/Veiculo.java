package capitulo4.veiculo;

public class Veiculo {
    int passageiros;
    int capacidadeCombustivel;
    int consumo;

    //Construtor para veiculo.
    Veiculo(int p, int f, int m){
        passageiros = p;
        capacidadeCombustivel = f;
        consumo = m;
    }
    //Retorna autonomia do veiculo.
    int alcance(){
        return consumo * capacidadeCombustivel;
    }
    //Calcula o combustivel necessaria para cobrir determinada distância.
    double combustivelNecessario(int kilometros){
        return (double) kilometros / consumo;
    }
}
