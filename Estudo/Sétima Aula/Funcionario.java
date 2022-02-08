public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(double salario, String nome, int idade) {
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void seViraNos30() {
        System.out.println("Funcionario se virando nos 30");
    }

    @Override
    public String toString() {
        return "Funcionario [salario=" + salario + "]";
    }
    
}