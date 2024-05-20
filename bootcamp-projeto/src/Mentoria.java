import java.time.LocalDate;

public class Mentoria extends Conteudo{

    
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public String toString() {
        return "{ Titulo: '" + getTitulo() + '\''
        + ", Descrição: '"+ getDescricao() + '\'' +
        ", Data: '" + data + "' }";
    }
}
