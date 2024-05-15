import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.Scanner;

public class SupplierExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos 'Teste' deseja imprimir?");
        int resposta = scanner.nextInt();

        /*Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).toList();

        listaSaudacoes.forEach(s -> System.out.println(s));
        */
        
        //supplier nao recebe parametro, por isso o () -> ...
        Supplier<String> declaracao = () -> "Teste ";
        List<String> listaDeclaracao = Stream.generate(declaracao).limit(resposta)
        .toList();

        listaDeclaracao.forEach(System.out::println);
        scanner.close();

        List<String> listaComGenerate = Stream.generate( () -> "Teste" )
        .limit(5)
        .toList();

        System.out.println(listaComGenerate);
    }
}
