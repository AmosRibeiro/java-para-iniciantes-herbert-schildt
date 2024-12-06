package capitulo13.inventariogenerico;

public class Espada {
    private String nome;
    private Integer dano;

    public Espada(String n, Integer d){
        this.nome = n;
        this.dano = d;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getDano() {
        return dano;
    }
    public void setDano(Integer dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "Espada [nome=" + nome + ", dano=" + dano + "]";
    }

    
}
