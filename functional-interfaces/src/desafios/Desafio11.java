package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros = numeros.stream().sorted().toList();

        int somaDosQuadrados = somaDosQuadrados(numeros);
        List<Integer> listaAoQuadrado = listaAoQuadrado(numeros);
        
        System.out.print("Lista original ordenada: [ ");
        numeros.forEach(numero -> System.out.print(numero + " "));
        System.out.println("]");

        System.out.print("\nLista ao quadrado ordenada: [ ");
        listaAoQuadrado.forEach(numero -> System.out.print(numero + " "));
        System.out.println("]");

        System.out.println("\nSoma dos quadrados: " + somaDosQuadrados);
    }

    public static int somaDosQuadrados(List<Integer> lista){
        return listaAoQuadrado(lista).stream().reduce(0, (numero1, numero2) -> (numero1 + numero2));
    }

    public static List<Integer> listaAoQuadrado(List<Integer> lista){
        return lista.stream().map(numero -> numero * numero).sorted().toList();
    }
}
