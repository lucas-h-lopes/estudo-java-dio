package com.fazendosozinho.PortalEscola;
import java.util.Random;

public class Aluno {
    Random gerarNumeroAleatorio = new Random();
    String nomeAluno;
    String curso;
    boolean aprovado = false;
    int quantidadeFaltas = 0;
    double notaProva;

    double consultarNota(){
        return notaProva;
    }

    public void fazerProva(){
        notaProva = gerarNumeroAleatorio.nextDouble(0, 10);
        System.out.println("\nO aluno " + nomeAluno + " acaba de fazer prova.");
        
        aprovado = false;

        if (notaProva >= 6){
            aprovado = true;
        }     
    }

    protected String situacaoAluno(){
        String frase;
        if(aprovado){
            frase = "O aluno não precisará cursar a matéria novamente. Ele passou!";
            return frase;
        }
        frase = "O aluno PRECISARÁ cursar a matéria novamente. Ele NÃO passou!";
        return frase;
    }
    public void faltarAula(){
        quantidadeFaltas++;
    }
    
    protected int consultarFaltas(){
        return quantidadeFaltas;
    }
}
