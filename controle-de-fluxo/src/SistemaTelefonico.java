import java.util.Scanner;

public class SistemaTelefonico {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o plano para visualizar (BASIC | MIDIA | TURBO): ");
        String plano = scanner.next();
        System.out.println();

        System.out.println("O plano oferece: ");
        switch (plano.toUpperCase()) {
            case "TURBO":{
                System.out.println("-> 5Gb de Youtube.");
            }
            case "MIDIA":{
                System.out.println("-> Whats e Instagram grátis.");
            }
            case "BASIC":{
                System.out.println("-> 100 minutos de ligação.");
                break;
            }
            default:
                System.out.println("Plano não cadastrado no sistema...");
                break;
        }
    }
}
