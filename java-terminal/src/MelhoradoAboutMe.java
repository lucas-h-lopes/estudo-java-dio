import java.util.Scanner;
import java.util.Locale;

public class MelhoradoAboutMe {
    public static void main (String[] args){
        System.out.print("\033[H\033[2J"); //limpa a tela
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next(); // "a proxima entrada é um parametro do tipo string"

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next(); // "a proxima entrada é um parametro do tipo string"

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt(); // "a proxima entrada é um parametro do tipo int"

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble(); // " a próxima entrada é um parametro do tipo double"

        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " cm.");
    }
}