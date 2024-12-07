package capitulo14.filterlambda;

import java.util.*;


public class FilterLambda {
    public static void main(String[] args) {
        
        List<String> palavras = Arrays.asList("Java", "Lambda", "Spring", "Beans");

        List<String> palavrasFiltradas = palavras.stream().filter(palavra -> palavra.length() > 5).toList();

        System.out.println(palavrasFiltradas);
    }
}
