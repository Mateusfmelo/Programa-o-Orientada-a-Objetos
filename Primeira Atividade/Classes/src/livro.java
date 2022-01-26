import java.util.Date;

public class livro {
    //Atributos
    private String titulo;
    private String autor;
    private String editora;
    private String ISBN;
    private Date ano;
    private int edicao;

    //Construtores
    public livro(String titulo, String autor, String editora, String ISBN, Date ano, int edicao ){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ISBN = ISBN;
        this.ano = ano;
        this.edicao = edicao;
    }
    
    //Métodos
    public String gettitulo(){
        return titulo;
    }

    public void setcativa(String titulo){
        this.titulo = titulo;

    }

    public String getautor(){
        return autor;
    }

    public void setautor(String autor){
        this.autor = autor;
    }

    public String geteditora(){
        return editora;
    }

    public void seteditora(String editora){
        this.editora = editora;

    }

    public String getISBNa(){
        return ISBN;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;

    }

    public Date getano(){
        return ano;
    }

    public void setano(Date ano){
        this.ano = ano;

    }

    public int getedicao(){
        return edicao;
    }

    public void setedicao(int edicao){
        this.edicao = edicao;

    }

}