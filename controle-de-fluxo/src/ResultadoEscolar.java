public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 4;

        if (nota>=7){ //estrutura condicional composta
            System.out.println("Aprovado com nota " + nota); //possui bloco else
        }
        else if (nota >=5){
                System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        } //condições encadeadas

        System.out.println("-------------");

        int novaNota = 6;
        String resultado = novaNota >= 7 ? "Aprovado" : novaNota >=5 ? "Recuperação" : "Reprovado"; //condição ternária encadeada
        


        System.out.println(resultado);
    }
}
