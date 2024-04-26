public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"Lucas", "Beatriz","Évilein", "Gabriel Tavares"};

        System.out.println("Lista de alunos\n------------------");
        for (int x = 0; x < alunos.length; x++){
            System.out.println("Aluno " + (x+1) + "- " + alunos[x]);
        }
    }
}
