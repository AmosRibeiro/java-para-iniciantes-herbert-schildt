package capitulo6.carroatividade;

import javax.swing.JOptionPane;

public class Carro {
    private int id;
    private String modelo;
    private double quilometragem;
    private double valorVenda;

    public void cadastrarCarro() {
        this.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do carro"));
        this.modelo = JOptionPane.showInputDialog("Digite o modelo do carro");
        this.quilometragem = Double.parseDouble(JOptionPane.showInputDialog("Digite a quilometragem do carro"));
        this.valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de venda do carro"));
    }

    public String imprimirResumoCarro() {
        String msg = "Id: " + this.id + "\n" + "Modelo: " + this.modelo + "\n";
        msg += "Quilometragem: " + this.quilometragem + "\n" + "Valor venda: " + this.valorVenda;
        return msg;
    }

    public void atualizarValorDesconto(double percentualDesconto) {
        this.valorVenda *= (percentualDesconto / 100);
    }

    public double getValorVenda() {
        return this.valorVenda;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }
    public double getQuilometragem() {
        return quilometragem;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
}
