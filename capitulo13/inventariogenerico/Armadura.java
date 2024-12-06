package capitulo13.inventariogenerico;

public class Armadura {
    private String nome;
    private Integer defesa;
    private String raridade;

    public Armadura(String n, String r, Integer d){
        this.nome = n;
        this.defesa = d;
        this.raridade = r;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    @Override
    public String toString() {
        return "Armadura [nome=" + nome + ", defesa=" + defesa + ", raridade=" + raridade + "]";
    }

    
}
