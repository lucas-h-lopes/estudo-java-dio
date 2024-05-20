import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("Curso 1");
        curso.setDescricao("O primeiro curso do site");
        curso.setCargaHoraria(72);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria(); 

        mentoria.setTitulo("Mentoria 1");
        mentoria.setDescricao("A primeira mentoria do site");
        mentoria.setData(LocalDate.now());
        
        System.out.println(mentoria);

    }
}
