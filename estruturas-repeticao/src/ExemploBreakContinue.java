public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <=5; numero++){
            if (numero == 3){
                //break; saiu do for   imprime 1 e 2
                continue; //não vai imprimir o que tem abaixo dessa linha, retorna ao for
            }
            System.out.println(numero);
        }

        String linha = "------------------";
        System.out.println(linha);

        for(int x = 1; x <=100; x++){
            if (x % 2 == 0) {
                continue;
            }
            System.out.println(x);
        }

        System.out.println(linha);
    }
}
