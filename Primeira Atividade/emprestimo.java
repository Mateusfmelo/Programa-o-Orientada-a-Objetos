import java.util.Date;

public class emprestimo {
    //Atributos
    private Date dataDeEmprestimo;
    private Date dataPrevistaDeDevolucao;
    private Date dataDeEntregaReal;
    private int situacao;

    //Construtores
    public emprestimo(Date dataDeEmprestimo, int situacao, Date dataPrevistaDeDevolucao, Date dataDeEntregaReal){
        this.dataDeEmprestimo = dataDeEmprestimo;
        this.situacao = situacao;
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
        this.dataDeEntregaReal = dataDeEntregaReal;
    }
    
    //Métodos
    public Date getdataDeEmprestimo(){
        return dataDeEmprestimo;
    }

    public void setdataDeEmprestimo(Date dataDeEmprestimo){
        this.dataDeEmprestimo = dataDeEmprestimo;

    }

    public int getsituacao(){
        return situacao;
    }

    public void setsituacao(int situacao){
        this.situacao = situacao;
    }

    public Date getdataPrevistaDeDevolucao(){
        return dataPrevistaDeDevolucao;
    }

    public void setdataPrevistaDeDevolucao(Date dataPrevistaDeDevolucao){
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;

    }

    public Date getdataDeEntregaReal(){
        return dataDeEntregaReal;
    }

    public void setdataDeEntregaReal(Date dataDeEntregaReal){
        this.dataDeEntregaReal = dataDeEntregaReal;
    }
    
}