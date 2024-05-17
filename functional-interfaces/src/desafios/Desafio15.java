package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        checarSePossuiNegativo(numeros);
        
    }

    public static void checarSePossuiNegativo(List<Integer> lista){
        List<Integer> novaLista = lista.stream()
            .filter(numero -> numero <0)
            .distinct()
            .toList();

            if(novaLista.isEmpty()){
                System.out.print("A lista não contém números negativos! ( ");
                lista.forEach(numero -> System.out.print(numero + " "));
                System.out.print(").");
            }else{
                System.out.print("A lista CONTÉM números negativos! ( | ");
                novaLista.forEach(numero -> System.out.print(numero + "| "));
                System.out.print(").");
            }
    }
}
