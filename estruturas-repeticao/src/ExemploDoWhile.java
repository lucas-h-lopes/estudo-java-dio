import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do{
            System.out.println("Telefone tocando");
        }while(tocando());

        System.out.println("Alo !!!");
    }
    public static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);

        return !atendeu; //não está mais tocando pois a pessoa atendeu o telefone
    }
}
