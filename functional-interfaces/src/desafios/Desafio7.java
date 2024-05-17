package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maiorNumero = numeros.stream().max(Integer::compare).get(); //pega o maior número da lista
        
        /*
        int segundoMaiorNumero = 0;
        for (int numero : numeros){
            if (numero > segundoMaiorNumero && numero < maiorNumero){
                segundoMaiorNumero = numero;
            }
        }
        */

        int segundoMaiorNumero = numeros.stream()
            .filter(numero -> numero < maiorNumero)
            .max(Integer::compare).get();
 
        System.out.println("O segundo maior número é " + segundoMaiorNumero);       
    }

}
