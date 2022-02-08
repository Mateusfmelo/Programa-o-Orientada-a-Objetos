public class Aluno extends Pessoa{
    private String matricula;
    private int nota1, nota2;

    public Aluno(String matricula, String nome,  int idade) {
        super(nome, idade);
        this.matricula = matricula;
        this.nota1 = 0;
        this.nota2 = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        result = prime * result + nota1;
        result = prime * result + nota2;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        if (nota1 != other.nota1)
            return false;
        if (nota2 != other.nota2)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nota1=" + nota1 + ", nota2=" + nota2 + "]";
    }

    public void seViraNos30() {
        System.out.println("Aluno se virando nos 30");
    }

    
}
