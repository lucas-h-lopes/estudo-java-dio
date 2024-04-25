public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
// " a televisão é o objetivo e o usuário interage com esse objeto"
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void avançarCanal(){
        canal++;
    }
    public void retornarCanal(){
        canal--;
    }
    public void irAteCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
}
