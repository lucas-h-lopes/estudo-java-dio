package edu.lucas.primeirasemana;

public class SwitchCase {
    public static void main (String [] args){
        int n1,n2;

        n1 = 5;
        n2 = 7;
        int resultado = n1+n2;
        switch (resultado) {
            case 10:
                System.out.println("O resultado da operação é 10");
                break;
            default:
                System.out.println("O resultado da operação NÃO é 10...");
                break;
        }
    }
}
