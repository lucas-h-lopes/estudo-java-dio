package edu.lucas.primeirasemana;

public class Operadores {
    public static void main(String[]args){
        String nomeUm = "Lucas";
        String nomeDois = "Lucas";

        System.out.println(nomeUm.equals(nomeDois));


        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        int numero = 5;
        numero++;
        System.out.println("O número é: " + numero);

        numero--;
        numero--;
        System.out.println("O número é: " + numero);
        
        System.out.println(-numero); //-4
        System.out.println(numero);  //4 (nao alterou o valor de numero)

        numero = -numero;
        System.out.println(numero); //-4 (alterou o valor de numero)

        numero = numero * -1; 
        System.out.println(numero + "\n---------------"); //4 (alterou o valor de numero)

        int newNumero = 3;
        System.out.println(newNumero++); // 3 (imprimiu e depois incrementou)
        System.out.println(newNumero); // 4 (imprimiu o valor que foi incrementado anteriormente)
        System.out.println(++newNumero); // 5 (incrementou antes de imprimir)

        boolean variavel = true; //true
        System.out.println(!variavel); //imprimiu a negação, mas não altera o resultado da variável inicial
        System.out.println(variavel); // permanece true
        System.out.println("");

        variavel = !variavel; // inverte o valor dela
        System.out.println(variavel); // false
        System.out.println(!variavel); // true

        System.out.println("\nOperador ternário\n");
        int a,b;
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);
                            //expressao que retorna verdadeiro ou falso          caso verdadeiro             caso falso
        String confirmaResultado = resultado == "verdadeiro" ? "O resultado está retornando verdadeiro" : "O resultado está retornando falso";
        System.out.println(confirmaResultado);  

        System.out.println("----------\nOperadores relacionais\n");
        a = 6;
        boolean simNao = a == b;
        String resposta = simNao ? "A é igual a B\nValor de A: " + a + "\nValor de B: " + b  : "A é diferente de B\nValor de A: " + a + "\nValor de B: " + b;

        System.out.println(resposta);


    }
}
