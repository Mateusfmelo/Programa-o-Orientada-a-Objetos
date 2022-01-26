public class exemplar {
    //Atributos
    private boolean cativa;
    private boolean emprestada;
    private int codigo;
    

    //Construtores
    public exemplar(int codigo, boolean cativa, boolean emprestada){
        this.cativa = cativa;
        this.codigo = codigo;
        this.emprestada = emprestada;
    }
    
    //Métodos
    public boolean getcativa(){
        return cativa;
    }

    public void setcativa(boolean cativa){
        this.cativa = cativa;

    }

    public boolean getemprestada(){
        return emprestada;
    }

    public void setemprestada(boolean emprestada){
        this.emprestada = emprestada;
    }

    public int getcodigo(){
        return codigo;
    }

    public void setcodigo(int codigo){
        this.codigo = codigo;

    }

}
