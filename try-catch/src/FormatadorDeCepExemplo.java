public class FormatadorDeCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23.765-06");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negócio");
        }
        
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8){
            throw new CepInvalidoException();
        }

        return "23.765-064";
    }
    
}
