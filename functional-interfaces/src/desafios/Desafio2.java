package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosPares = numeros.stream()
            .filter(numero -> numero % 2 == 0)
            .reduce(0, (num1, num2) -> num1 + num2);

        System.out.print("Os números pares são: ");
        numeros.stream()
            .filter(numero -> numero % 2 == 0)
            .forEach(numero -> System.out.print(numero + " "));

        System.out.println("\nA soma dos números pares é: " + somaDosPares);
    }
}
