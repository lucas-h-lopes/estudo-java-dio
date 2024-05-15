import java.util.Arrays;
import java.util.List;
//import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        List<String> palavras = Arrays.asList("bola", "cAchorro", "Aviao", "China", "mousE", "teclado");

        List<Integer> numerosDobrados = numeros.stream()
        .map(nu -> nu*2)
        .toList();
        numerosDobrados.forEach(n -> System.out.println(n));

        System.out.println("=============");

        List<String> palavrasMaiusculas = converterMaisculoLista(palavras);
        palavrasMaiusculas.forEach(System.out::println); //method reference
    }

    public static List<String> converterMaisculoLista(List<String> listaPalavras){
        List<String> listaPalavrasMaiusculas = listaPalavras
        .stream()
        .map(String::toUpperCase).toList();
        //String::toUpperCase: method reference, transforma as Strings do array (por causa do map() )
        //para maiúsculas
        //poderia ser escrito da seguinte maneira: map(s -> s.toUpperCase())
        return listaPalavrasMaiusculas;
    }
}
