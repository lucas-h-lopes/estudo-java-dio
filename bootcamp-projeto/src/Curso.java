public class Curso extends Conteudo {
    
    private int cargaHoraria;
   
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "{ Titulo: '" +  getTitulo() + '\''
        + ", Descrição: '"+ getDescricao() + '\'' +
        ", Carga Horária: " + cargaHoraria + " }";
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
