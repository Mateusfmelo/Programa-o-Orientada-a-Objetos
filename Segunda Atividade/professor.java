public class professor {
    //Atributos
    private int matricula;
    private String nome;
    private String departamento;
    

    //Construtores
    public professor (int matricula, String nome, String departamento){
        this.matricula = matricula;
        this.departamento = departamento;
        this.nome = nome;
    }
    
    //Métodos
    public int getmatricula(){
        return matricula;
    }

    public void setmatricula(int matricula){
        this.matricula = matricula;

    }

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public String getdepartamento(){
        return departamento;
    }

    public void setdepartamento(String departamento){
        this.departamento = departamento;

    }

    @Override
    public String toString(){
        return
                "Professor:" + getnome() +
                    "\nMatricula:"+ getmatricula()+
                    "\nDepartamento:" + getdepartamento();
                    
    }

}
