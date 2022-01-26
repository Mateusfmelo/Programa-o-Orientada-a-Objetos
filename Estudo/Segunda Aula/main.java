class Main {
    public static void main(String[] args) {
    pessoa joao =  new pessoa("João", 18, "joao@gmail.com");

    bola Bola = new bola("O daqui mesmo", "branca", 0.5);

    pessoa maria = new pessoa("Maria", 19, "maria@gmail.com");

    pessoa joana = new pessoa("Joana", 17, "joana@gmail.com");

    System.out.println(joao.getNome());
    System.out.println(joao.getIdade());
    System.out.println(joao.getEmail());

    joao.setNome("João da Silva");
    System.out.println(joao.getNome());
    }
  }