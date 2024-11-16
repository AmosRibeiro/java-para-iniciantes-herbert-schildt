package capitulo6.carroatividade;

import javax.swing.JOptionPane;

public class Venda {

    private Carro carro;
    private Cliente cliente;

    public void realizarVenda() {
        this.carro = new Carro();
        carro.cadastrarCarro();
        this.cliente = new Cliente();
        cliente.cadastrarCliente();

       

        double parcela = this.carro.getValorVenda() / 36;

        if(validarVenda(parcela, this.cliente.getRenda(), this.cliente.getIdade())){
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null,"Venda não realizada!");
        }

        System.out.println(carro.imprimirResumoCarro() + "\n" + cliente.imprimirResumoCliente() + "\n" + carro.atualizarValorDesconto(1));
    }

    public boolean validarVenda(double valorParcela, double renda, int idade){
        boolean resultado = false;
        double valorReferencia = renda * 0.3;
        resultado = valorParcela < valorReferencia && idade > 18;
        return resultado;
    }
}
