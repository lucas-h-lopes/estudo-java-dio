package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        int produto = calcularProdutoNumeros(numeros);

        System.out.println("O produto de todos os números da lista é " + produto);
    }

    public static int calcularProdutoNumeros(List<Integer> lista){
        return lista.stream().reduce(1, (numero1, numero2) -> (numero1 * numero2));
    }
}
