package capitulo14.lambdawithobjects;

import java.util.*;

public class FiltroPessoa {
    public static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Amanda", 25),
            new Pessoa("Juliana", 26),
            new Pessoa("Ana", 32)
        );
        
        List<String> nomes = pessoas.stream().map(pessoa -> pessoa.getNome()).toList();
        List<Integer> idades = pessoas.stream().map(Pessoa::getIdade).toList();

        System.out.println("Nomes: " + nomes + " Idades: " + idades);
    }
}
