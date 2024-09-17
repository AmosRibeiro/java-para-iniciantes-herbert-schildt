package capitulo4.veiculo;

class Veiculos {

    public static void main(String[] args) {
        Veiculo porche = new Veiculo();
        Veiculo bmw = new Veiculo();

        double litrosGasolina;
        int distancia = 200;


        porche.passageiros = 2;
        porche.capacidadeCombustivel = 10;
        porche.consumo =8;

        bmw.passageiros = 4;
        bmw.capacidadeCombustivel = 18;
        bmw.consumo = 10;

        litrosGasolina = porche.combustivelNecessario(distancia);
        System.out.println("A porche pode acomodar "+ porche.passageiros + " passageiros e tem um alcance de " + porche.alcance() + ". E para ir a uma distancia de " + distancia + " KM, precisa de " + litrosGasolina + " litros de gasolina.");
        litrosGasolina = bmw.combustivelNecessario(distancia);
        System.out.print("A bmw pode acomodar " + bmw.passageiros + " passageiros e tem um alcance de " + bmw.alcance() + ". E para ir a uma distancia de " + distancia + " KM, precisa de " + litrosGasolina + " litros de gasolina.");
       
    }
}