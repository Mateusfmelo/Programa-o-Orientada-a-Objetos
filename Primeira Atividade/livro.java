import java.util.Date;

public class Livro {
    //Atributos
    private String titulo, autor, ISBN, editora;
    private Date ano;
    private int edicao;

    //Construtores
    public Livro(String titulo, String autor, String ISBN, String editora, Date ano, int edicao ){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ISBN = ISBN;
        this.ano = ano;
        this.edicao = edicao;
    }
    
    //Métodos
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;

    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

        public String getISBN(){
        return ISBN;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public String getEditora(){
        return editora;
    }

    public void setEditora(String editora){
        this.editora = editora;

    }

    public Date getAno(){
        return ano;
    }

    public void setAno(Date ano){
        this.ano = ano;

    }

    public int getEdicao(){
        return edicao;
    }

    public void setEdicao(int edicao){
        this.edicao = edicao;
    }

}