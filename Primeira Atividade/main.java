import java.util.Date;
class Main {
    public static void main(String[] args) {
        Usuario joao = new Usuario("João", "1472525612" ,"78912312" , 40028922);
        System.out.println("Nome: " + joao.getNome());
        System.out.println("CPF: " + joao.getCPF());
        System.out.println("Matrícula: " + joao.getMatricula());
        System.out.println("Telefone: " + joao.getTelefone());

        //Criar objeto livro
        Livro livro = new Livro("Java", "Severino", "4002", "IFPB", new Date(), 1);

        //Criar Objeto exemplar
        Exemplar exemplar = new Exemplar(1, false, true, livro);

        //Criar Objeto emprestimo
        Emprestimo emprestimo =  new Emprestimo (new Date(), new Date(), new Date(), 0, joao, exemplar);
        System.out.println("Data de Empréstimo: " + emprestimo.getDataEmprestimo());
        System.out.println("Data Prevista de Devolução: " + emprestimo.getDataPrevistaDeDevolucao());
        System.out.println("Data de Devolução: " + emprestimo.getDataDeEntregaReal());
        System.out.println("Situação: " + emprestimo.getSituacao());
    }
  }