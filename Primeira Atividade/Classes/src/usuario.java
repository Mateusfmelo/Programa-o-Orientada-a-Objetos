public class usuario {
    //Atributos
    private String nome;
    private int CPF;
    private String telefone;
    private String matricula;

    //Construtores
    public usuario(String nome, int CPF, String telefone, String matricula){
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.matricula = matricula;
    }
    
    //Métodos
    public String getNome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;

    }

    public int getCPF(){
        return CPF;
    }

    public void setCPF(int CPF){
        this.CPF = CPF;
    }

    public String gettelefone(){
        return telefone;
    }

    public void settelefone(String telefone){
        this.telefone = telefone;

    }

    public String getmatricula(){
        return matricula;
    }

    public void setmatricula(String matricula){
        this.matricula = matricula;
    }
}
