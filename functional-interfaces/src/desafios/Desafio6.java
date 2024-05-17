package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosMaior10 = numeros.stream()
            .filter(numero -> numero > 10)
            .toList();
        
        if (numerosMaior10.isEmpty()){
            System.out.println("\nNão há número maior que 10 na lista!\nLista: " + numeros + "\n");
        }else{
            System.out.print("\nHá número maior que dez na lista ( ");
            numerosMaior10.forEach(numero -> System.out.print(numero + " "));
            System.out.print(").\n");            
        }
    }
}
