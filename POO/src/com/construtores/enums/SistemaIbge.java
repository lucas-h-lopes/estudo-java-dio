package com.construtores.enums;

public class SistemaIbge {
    public static void main(String[] args) {
        System.out.println("Lista de todos os estados:");
        for (EstadoBrasileiro estado : EstadoBrasileiro.values()){ //para cada estado nos valores da classe EstadoBrasileiro 
            System.out.println(estado.getSigla() + " - " + estado.getNome() );
        }

        EstadoBrasileiro estado = EstadoBrasileiro.BAHIA;

        System.out.println("------\nO estado é: " + estado.getNome());
        System.out.println("A sigla do estado é: " + estado.getSigla());
    }
}
