package capitulo05;

public class Voo {
    private String codigo;
    private int totalAssentos;
    private int assentosOcupados;
    private int assentosDisponiveis;
    private String aeroPortoOrigem;
    private String aeroPortoDestino;

    public Voo(String codigo, int totalAssentos){
        this.codigo = codigo;
        this.totalAssentos = totalAssentos;
        this.assentosOcupados = 0;
        this.assentosDisponiveis = 100;
    }

    public void reservarAssento(){
        if(assentosOcupados < totalAssentos)
        assentosOcupados++;
    }

    public int getAssentosDisponiveis(){
        assentosDisponiveis = assentosOcupados - totalAssentos;
        return assentosDisponiveis;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getAeroPorto(){
        return aeroPortoDestino + aeroPortoOrigem;
    }
}
