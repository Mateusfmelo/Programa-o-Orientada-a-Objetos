public class Exemplar {
    //Atributos
    private boolean cativa, emprestada;
    private int codigo;
    

    //Construtores
    public Exemplar(boolean cativa, boolean emprestada, int codigo){
        this.cativa = cativa;
        this.emprestada = emprestada;
        this.codigo = codigo;
    }
    
    //Métodos
    public boolean getCativa(){
        return cativa;
    }

    public void setCativa(boolean cativa){
        this.cativa = cativa;

    }

    public boolean getEmprestada(){
        return emprestada;
    }

    public void setEmprestada(boolean emprestada){
        this.emprestada = emprestada;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

}