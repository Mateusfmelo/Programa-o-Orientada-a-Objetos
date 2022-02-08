public class Principal {
    public static void main(String [] args) {
        Cadastro cad = new Cadastro();
        Pessoa p1 = new Aluno ("32131", "João", 18);
        Pessoa p2 = new Aluno ("32131", "Maria", 16);
        Pessoa p3 = new Funcionario(123, "Joana", 17);
        Pessoa p4 = new Professor("BD", 32121, "Antonio", 35);
        cad.adicionar(p1);
        cad.adicionar(p2);
        cad.adicionar(p3);
        cad.adicionar(p4);

        cad.quadroSeViraNos30();
    }
}
