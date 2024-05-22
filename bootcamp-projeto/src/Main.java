public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("Curso 1");
        curso.setDescricao("O primeiro curso do site");
        curso.setCargaHoraria(72);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria(); 

        mentoria.setTitulo("Mentoria Java Developer");
        mentoria.setDescricao("Descrição Mentoria Java Developer");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Lucas");
        dev.inscrever(bootcamp);

        Dev paulo = new Dev();
        paulo.setNome("Paulo");
        paulo.inscrever(bootcamp);

        System.out.println("Conteúdos inscritos " + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteúdos concluídos" + dev.getConteudosConcluidos());
    }
}
