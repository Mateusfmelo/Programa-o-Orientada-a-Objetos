public class Main {
    public static void main(String[] args){
        Mercadinho mercadinho = new Mercadinho();

        ClienteRegular CLRegular = new ClienteRegular ("Mateus", 19.99);
        ClienteVip CLVip = new ClienteVip ("Joana", 78.00, "400892");
        ClienteOuroVip CLOuroVip = new ClienteOuroVip ("Lucas", 25.00, "Rua Epitácio Pessoa");

        mercadinho.adicionarCliente(CLRegular);
        mercadinho.adicionarCliente(CLVip);
        mercadinho.adicionarCliente(CLOuroVip);

        mercadinho.calcularTotal();

        mercadinho.imprimirCliente();

    }
}