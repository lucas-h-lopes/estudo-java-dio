package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros = numeros.stream().sorted().toList();

        List<Integer> agruparValores = numeros.stream()
            .filter(numero -> numero % 2 == 1 && (numero % 3 == 0 || numero % 5 == 0))
            .sorted()
            .toList();

        System.out.println("Lista original ordenada: " + numeros);
        System.out.println("Lista com múltiplos de 3 e 5: " + agruparValores);
    }
}
