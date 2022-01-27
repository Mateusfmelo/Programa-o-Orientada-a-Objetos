import java.util.Date;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //Leitura do teclado
        Scanner teclado = new Scanner(System.in);

        //Criar objeto usuario
        System.out.println("Digite o nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite o telefone: ");
        String telefone = teclado.nextLine();

        System.out.println("Digite a matrícula: ");
        String matricula = teclado.nextLine();

        System.out.println("Digite o CPF: :");
        int CPF = teclado.nextInt();

        Usuario joao = new Usuario(nome, telefone, matricula, CPF);
        System.out.println("Nome: " + joao.getNome());
        System.out.println("CPF: " + joao.getCPF());
        System.out.println("Matrícula: " + joao.getMatricula());
        System.out.println("Telefone: " + joao.getTelefone());

        //Criar objeto livro
        Livro livro = new Livro("Java", "Severino", "4002", "IFPB", new Date(), 1);

        //Criar objeto exemplar
        Exemplar exemplar = new Exemplar(1, false, true, livro);

        //Criar objeto emprestimo
        Emprestimo emprestimo =  new Emprestimo (new Date(), new Date(), new Date(), 0, joao, exemplar);
        System.out.println("Data de Empréstimo: " + emprestimo.getDataEmprestimo());
        System.out.println("Data Prevista de Devolução: " + emprestimo.getDataPrevistaDeDevolucao());
        System.out.println("Data de Devolução: " + emprestimo.getDataDeEntregaReal());
        System.out.println("Situação: " + emprestimo.getSituacao());
    }
  }