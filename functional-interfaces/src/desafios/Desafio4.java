package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> somenteNumerosPares = numeros.stream()
            .filter(numero -> numero % 2 == 0)
            .toList();
        
        System.out.println("Lista original: " + numeros);
        System.out.print("Lista sem os ímpares: ");
        somenteNumerosPares.forEach(numero -> System.out.print(numero + " "));

    }
}
