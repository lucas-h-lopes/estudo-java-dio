package edu.lucas.primeirasemana;

public class MinhaClasse { //deve conter o mesmo nome do arquivo
    public static void main(String[] args){
        System.out.println("Olá turma! Sejam bem-vindos."); //Classe System que tem métodos out e println
        //Arquivos .java são classes, ou seja, por convenção, a inicial de cada palavra deve ser letra maiúscula!

        //final String BR = "Brasil"; o final no começo da linha indica que BR não pode ser alterado
        //por padrão, todas as letras são maiúsculas

        String primeiroNome = "Lucas Henrique";
        String segundoNome = "Lopes";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        

        /*int anoFabricacao = 2022;

        boolean verdadeiroOuFalso = true;

        anoFabricacao = 2018;*/

        
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome).concat(".");
    }
}
