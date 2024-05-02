package com.Herança;

public class Usuario {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        Msn msn = new Msn();

        telegram.setVelConexao(2);
        telegram.assistirVideo("Acorda pedrinho");

        msn.setVelConexao(0);
        msn.adicionarAFila("matue quer voar");
    }
}
