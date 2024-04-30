package com.construtores;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public String getNome() { 
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() { 
        return endereco; //getters -> return "nomeVariavel";
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco; //setters -> this.nomeVariavel = novoNomeVariavel;
    }

    public Pessoa(String cpf, String nome){ //método construtor
        this.cpf = cpf;
        this.nome = nome;
    }
    
  
}

