package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        //List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosNegativos = numeros.stream()
        .filter(numero -> numero < 0)
        .toList();

        if (numerosNegativos.isEmpty()) {
            System.out.println("A lista " + numeros + " contém somente números positivos.");
        }else{
            System.out.println("A lista " + numeros + " contém números negativos (" + numerosNegativos + ").");
        }
         
    }
}
