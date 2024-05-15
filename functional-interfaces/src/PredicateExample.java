import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample{
    public static void main(String[] args) {
        List<String> listaLinguagensProgramacao = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby", "assembly");
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        listaLinguagensProgramacao.stream().filter(maisDeCincoCaracteres)
        .forEach(System.out::println);

        /*
         * listaLinguagensProgramacao.stream().filter(palavra -> palavra.length() > 5)
         * .forEach(System.out::println);
         */

         List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6);
         List<Integer> listaNumerosPares = listaNumeros.stream()
         .filter(numero -> numero % 2 == 0) //filtra os elementos do array baseado na condição( )
         .toList(); //converte para lista 

         System.out.println("A lista original é: "+listaNumeros);
         System.out.println("A lista com somente números pares é: "+ listaNumerosPares);
    }
}