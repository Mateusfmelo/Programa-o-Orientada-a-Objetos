public class Principal {
    public static void main(String[] args) {

        CadastroMilitar cadastro = new CadastroMilitar();

        Militar MilitarEB = new MilitarExercito(6588461, "Subtenente", true, true);
        Militar MilitarMB = new MilitarMarinha(518712, "Sargento", false);
        Militar MilitarFAB = new MilitarAeronautica(4145516, "Tenente", 3, 101);

        cadastro.adicionarMilitar(MilitarEB);
        cadastro.adicionarMilitar(MilitarMB);
        cadastro.adicionarMilitar(MilitarFAB);

        System.out.println("X------------------------------------------X");

        cadastro.podeProgredir();

        System.out.println("X------------------------------------------X");

        cadastro.realizarPromocao();

        System.out.println("X------------------------------------------X");

        System.out.println("O polimorfismo está acontecendo na classe\nPrincipal, onde os métodos estão sendo\nimportados de outras classes, ainda que\no nome do método nesse caso(podeProgredir)\nseja igual, possuem operações exclusivas\npara cada classe.");

        System.out.println("X------------------------------------------X");
        
    }
}