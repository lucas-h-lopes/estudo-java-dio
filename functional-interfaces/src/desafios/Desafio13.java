package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> listaIntervalo = calcularIntervalo(numeros, 5, 10);
        
        System.out.print("Os números entre 5 e 10 são " + listaIntervalo);
    }

    public static List<Integer> calcularIntervalo(List<Integer> lista, int intervaloInferior, int intervaloSuperior){
        return lista.stream()
                .filter(numero -> numero >= intervaloInferior && numero <= intervaloSuperior)
                .sorted()
                .toList();
    }
}
