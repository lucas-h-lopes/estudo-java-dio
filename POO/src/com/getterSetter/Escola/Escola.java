package com.getterSetter.Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Lucas");
        aluno1.setIdade(19);

        System.out.println("O aluno " + aluno1.getNome() + " tem " + aluno1.getIdade() + " anos de idade.");

        aluno1.setSexo("Masculino");
        System.out.println("Sexo do aluno: " + aluno1.getSexo());
    }
}
