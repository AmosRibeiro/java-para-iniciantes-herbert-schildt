package capitulo4.veiculo;

class Veiculos {

    public static void main(String[] args) {
        Veiculo porche = new Veiculo();
        Veiculo bmw = new Veiculo();

        int alcance1, alcance2;

        porche.passageiros = 2;
        porche.capacidadeCombustivel = 10;
        porche.consumo =8;

        bmw.passageiros = 4;
        bmw.capacidadeCombustivel = 18;
        bmw.consumo = 10;

        System.out.print("A porche pode acomodar "+ porche.passageiros + " passageiros.");
        porche.alcance();

        System.out.print("A bmw pode acomodar " + bmw.passageiros + " passageiros.");
        bmw.alcance();
    }
}