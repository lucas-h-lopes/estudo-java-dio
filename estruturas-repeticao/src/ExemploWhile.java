import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        String nome = "Joãozinho";
        double mesada = 50.0;
        
        int cont = 0;
        while(mesada > 0){
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada){
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: " + valorDoce + " adicionado ao carrinho!");
            mesada -= valorDoce;
            cont++;
        }
        System.out.println(nome + " comprou " + cont + " doces.");

    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
