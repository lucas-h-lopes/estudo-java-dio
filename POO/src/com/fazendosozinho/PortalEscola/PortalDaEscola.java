package com.fazendosozinho.PortalEscola;
import java.util.Scanner;

public class PortalDaEscola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do aluno:");
        aluno.nomeAluno = scanner.next();

        System.out.println("Informe o curso do aluno:");
        aluno.curso = scanner.next();

        int faltas = aluno.consultarFaltas();
        System.out.println("\nFaltas: " + faltas);

        aluno.faltarAula();
        aluno.faltarAula();

        faltas = aluno.consultarFaltas();
        System.out.println("Faltas: " + faltas);
        
        aluno.fazerProva();

        //double nota = aluno.consultarNota();
        //System.out.println("\nA nota de " + aluno.nomeAluno + " é igual a: " + nota );
        String situacaoAluno = aluno.situacaoAluno();
        System.out.println(situacaoAluno);
        
    }
    
    
}
