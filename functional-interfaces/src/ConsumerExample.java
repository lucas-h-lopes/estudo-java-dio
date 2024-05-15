import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        /*Consumer<Integer> imprimirNumerosPares = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };*/
        numeros.stream()
            .filter(numero -> numero % 2 == 0)
            .forEach(System.out::println);

    }

}
