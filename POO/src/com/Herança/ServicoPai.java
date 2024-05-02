package com.Herança;

public class ServicoPai {
    private String video;
    private double velConexao = 0;

    public void assistirVideo(String video){
        if(verificarConexaoInternet()){
            this.video = video;
            System.out.println("O vídeo " + this.video + " está tocando!");
        }else
        {
            System.out.println("Não há Internet para reproduzir o vídeo");
        }        
    }
    public void adicionarAFila(String video){
        if(verificarConexaoInternet()){
        this.video = video;
        System.out.println("O vídeo " + this.video + " foi adicionado a fila!");
        }else{
            System.out.println("Não há Internet para adicionar o vídeo " + video);
        }
    }

    private boolean verificarConexaoInternet(){

        if (velConexao > 0){
            return true;
        }
        return false;
    }

    public double getVelConexao(){
        return velConexao;
    }
    public void setVelConexao(double velConexao){
        this.velConexao = velConexao;
    }

    
}
