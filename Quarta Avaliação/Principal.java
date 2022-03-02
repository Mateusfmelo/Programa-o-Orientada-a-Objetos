public class Principal {
    public static void main (String [] args) {

        CadastroFrete cadastroFrete = new CadastroFrete ();

        Frete ft1 = new FretePadrao(50, 7);
        Frete ft2= new FreteExpresso(40, 7, 9);
        Frete ft3 = new FreteSuperExpresso(90, 7, 1000, 10);

        cadastroFrete.adicionarFrete(ft1);
        cadastroFrete.adicionarFrete(ft2);
        cadastroFrete.adicionarFrete(ft3);

        cadastroFrete.valorTotalFretes();

        System.out.println("O polimorfismo está acontecendo na classe Principal, onde os métodos estão\nsendo importados de outras classes, ainda que o nome do método nesse caso\n(calcularFrete) seja igual, possuem operações exclusivas para cada classe.");
    }
}
