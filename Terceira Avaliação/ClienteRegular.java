public class ClienteRegular extends Cliente {

    public ClienteRegular(String nome, Double valorDaCompra) {
        super(nome, valorDaCompra);
    }

    @Override
    public double CalcularPagamento (){
        return this.getValorDaCompra();
    }
}