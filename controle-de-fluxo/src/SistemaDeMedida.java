public class SistemaDeMedida {
    public static void main(String[] args) {
        String sigla = "m";

        switch (sigla.toUpperCase()){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:{
                System.out.println("INDEFINIDO");
            }
        }
    }
}
