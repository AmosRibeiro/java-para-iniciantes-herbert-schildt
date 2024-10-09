package capitulo5;

public class ConversaoDolar {
    
    private final double cotacaoDolar = 5.5;
    private final double iof = 0.0586;
    private final double taxaOperacaoEmPercentual = 1;

    @SuppressWarnings("Unused")
    public double comprarDolar(double valorReal){

        double valorDolar = valorReal / cotacaoDolar;
        double valorDolarComIOF = valorDolar - (valorDolar * iof);
        double taxaOperacao = valorDolar * (taxaOperacaoEmPercentual/100);
        
        double valorConvertido = valorDolarComIOF - taxaOperacao;
        return valorConvertido;
    }

    public static void main(String[] args) {
        ConversaoDolar conversao = new ConversaoDolar();
        double valorReal = 1000;
        double valorDolar = conversao.comprarDolar(valorReal);
        System.out.println("Valor em dólar: " + valorDolar);
    }
}
