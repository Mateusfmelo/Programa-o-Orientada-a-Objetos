import java.util.Date;

public class Emprestimo {
    //Atributos
    private Date dataEmprestimo, dataPrevistaDeDevolucao, dataDeEntregaReal;
    private int situacao;
    private Usuario usuario;
    private Exemplar exemplar;

    //Construtores
    public Emprestimo(Date dataEmprestimo, Date dataPrevistaDeDevolucao, Date dataDeEntregaReal, int situacao, Usuario usuario, Exemplar exemplar){
        this.dataEmprestimo = dataEmprestimo;
        this.situacao = situacao;
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
        this.dataDeEntregaReal = dataDeEntregaReal;
        this.usuario = usuario;
        this.exemplar = exemplar;
    }
    
    //Métodos
    public Date getDataEmprestimo(){
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataPrevistaDeDevolucao(){
        return dataPrevistaDeDevolucao;
    }

    public void setDataPrevistaDeDevolucao(Date dataPrevistaDeDevolucao){
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
    }

    public Date getDataDeEntregaReal(){
        return dataDeEntregaReal;
    }

    public void setDataDeEntregaReal(Date dataDeEntregaReal){
        this.dataDeEntregaReal = dataDeEntregaReal;
    }

    public int getSituacao(){
        return situacao;
    }

    public void setSituacao(int situacao){
        this.situacao = situacao;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Exemplar getExemplar(){
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

}