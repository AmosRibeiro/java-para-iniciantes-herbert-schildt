package capitulo5.transacao;

public class Transacao {
    private char tipo;
    private double valor;
    
    

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
    

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
}
