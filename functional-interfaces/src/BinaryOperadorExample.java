import java.util.Arrays;
import java.util.List;

public class BinaryOperadorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        int resultado = numeros.stream()
        .reduce(0, (num1, num2) -> num1 + num2);
        /* identity é uma variável temporária onde os valores serão armazenados
         * inicializa com 0 para que não haja interferências com o resultado da soma de todos os valores
        */
        System.out.println("A soma dos números é " + resultado);
    }    
}
