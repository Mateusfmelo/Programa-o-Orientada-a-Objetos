import java.util.ArrayList;

public class Mercadinho {
    ArrayList <Cliente> clientes = new ArrayList <>();

    public void adicionarCliente(Cliente z) {
        clientes.add(z);
    }

    public void calcularTotal(){
        double aux = 0;
        for (int c = 0; c < clientes.size(); c++){
            aux += clientes.get(c).CalcularPagamento();
        }
        System.out.println("O valor total das compras com desconto é: R$" + aux);
        System.out.println("O clientes são:");
    }

    public void imprimirCliente() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).getNome());
        }
    }
}