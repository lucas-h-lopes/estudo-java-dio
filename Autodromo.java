public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("53721");
        System.out.println(jeep.getChassi());

        Moto biz = new Moto();
        biz.setChassi("36216");
        System.out.println(biz.getChassi());
    }
}
