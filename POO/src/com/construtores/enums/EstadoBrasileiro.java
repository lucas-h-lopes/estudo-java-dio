package com.construtores.enums;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí"),
    MARANHAO ("MA", "Maranhão"),
    BAHIA ("BH", "Bahia");

    private String nome;
    private String sigla;

    private EstadoBrasileiro (String sigla, String nome){ //privado pois a criação é feita na própria classe
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getSigla(){
        return sigla;
    }

    public String getNome(){
        return nome;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
