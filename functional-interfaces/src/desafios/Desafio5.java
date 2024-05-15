package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosMaiores5 = numeros.stream()
            .filter(numero -> numero > 5)
            .toList();
        
        double mediaNumeros = numerosMaiores5.stream()
            .reduce(0, (numero1, numero2) -> (numero1 + numero2)) / numerosMaiores5.size();
        
        System.out.print("Números maiores que 5: ");
        numerosMaiores5.forEach(numero -> System.out.print(numero + " "));
        System.out.println("\nA média dos números maiores que 5 é: " + mediaNumeros);
    }   
}
