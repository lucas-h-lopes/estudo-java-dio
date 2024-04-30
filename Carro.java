public class Carro extends Veiculo{
    public void ligar(){
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
    public void confereCombustivel(){
        System.out.println("Conferindo combustível...");
    }
}
