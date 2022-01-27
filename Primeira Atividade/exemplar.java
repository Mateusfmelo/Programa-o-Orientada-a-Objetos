public class Exemplar {
    //Atributos    
    private int codigo;
    private boolean cativa, emprestada;
    private Livro livro;

    //Construtores
    public Exemplar(int codigo, boolean cativa, boolean emprestada, Livro livro){
        this.codigo = codigo;
        this.cativa = cativa;
        this.emprestada = emprestada;
        this.livro = livro;
    }
    
    //Métodos    
    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

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

    public Livro getLivro(){
        return livro;
    }

    public void setLivro(Livro livro){
        this.livro = livro;
    }

}