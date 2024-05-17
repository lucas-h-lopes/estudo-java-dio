package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosPrimos = numeros.stream()
            .filter(numero -> verificarPrimo(numero))
            .sorted()
            .toList();
        
        int maiorNumeroPrimo = maiorNumeroPrimo(numeros);

        System.out.println("Lista com somente números primos: " + numerosPrimos);
        System.out.println("O maior número primo da lista é: " + maiorNumeroPrimo);
    }

    public static int maiorNumeroPrimo(List<Integer> lista){
        int maiorNumeroPrimo = lista.stream()
            .filter(numero -> verificarPrimo(numero))
            .max(Integer::compare).get();
        
        return maiorNumeroPrimo;
    }

    public static boolean verificarPrimo(int numero){
        if (numero <=1){
            return false;
        }

       for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
}
}
