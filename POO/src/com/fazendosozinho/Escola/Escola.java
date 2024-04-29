package com.fazendosozinho.Escola;

import com.fazendosozinho.PortalEscola.Aluno;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.consultarNota();
        aluno.faltarAula();
        aluno.consultarFaltas();
    }
    
}
