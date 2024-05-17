package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosOrdenados = numeros.stream()
            .sorted()
            .toList();

        int somaNumeros = numeros.stream()
            .reduce(0, (numero1, numero2) -> numero1 + numero2);
        
        System.out.print("Valores da lista ordenados: ");
        numerosOrdenados.forEach(numero -> System.out.print(numero + " "));
        System.out.println("\nA soma dos números é: " + somaNumeros);
    }
}
