package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //List<Integer> novosNumeros = Arrays.asList(1,2,3,4);

        
        if(verificarValoresRepetidos(numeros)){
            System.out.println("Há números que se repetem na lista!");
        }else{
            System.out.println("NÃO há números que se repetem na lista!");
        }
        
    }

    public static boolean verificarValoresRepetidos(List<Integer> lista){
        List<Integer> novaLista = lista.stream()
        .distinct()
        .toList();

        if (!novaLista.isEmpty()){
            if(novaLista.equals(lista)){
                return false;
            }
            return true;
        }
        
        return false;
        
    }
}
