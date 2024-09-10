package capitulo4.veiculo;

public class DemoVeiculo {
    public static void main(String[] args) {
        Veiculo minivan = new Veiculo();
        int alcance;

        minivan.passageiros = 7;
        minivan.consumo = 21;
        minivan.capacidadeCombustivel = 16;

        alcance = minivan.capacidadeCombustivel * minivan.consumo;
        System.out.println("A Minivan pode carregar até " + minivan.passageiros + " passageiros e tem o o consumo de " + alcance);
    }
}
