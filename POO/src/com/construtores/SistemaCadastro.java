package com.construtores;

public class SistemaCadastro {
    public static void main(String[] args) {

        
        Pessoa marcos = new Pessoa("1234", "marcos"); //necessário passar como parâmetro

        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println("CPF: " + marcos.getCpf() + "\nNome: " + marcos.getNome());
    }
}
