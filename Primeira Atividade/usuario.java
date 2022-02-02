public class Usuario {
    //Atributos
    private String nome, telefone, matricula;
    private int CPF;

    //Construtores
    public Usuario(String nome, String telefone, String matricula, int CPF){
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.matricula = matricula;
    }
    
    //Métodos
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;

    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }   
    
    public int getCPF(){
        return CPF;
    }

    public void setCPF(int CPF){
        this.CPF = CPF;
    }

    public String toString(){
        return " Nome: " + nome + " telefone: " + telefone + " matricula: " + matricula + " CPF: " + CPF;
    }
}
