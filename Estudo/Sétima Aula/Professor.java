public class Professor extends Funcionario{

    private String disciplina;

    public Professor(String disciplina, double salario, String nome, int idade) {
        super(salario, nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void seViraNos30() {
        System.out.println("Professor se virando nos 30");
    }

    @Override
    public String toString() {
        return "Professor [disciplina=" + disciplina + "]";
    }

}
