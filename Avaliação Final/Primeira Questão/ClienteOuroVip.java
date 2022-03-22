public class ClienteOuroVip extends Cliente {
    private String endereço;

    public ClienteOuroVip(String nome, Double valorDaCompra, String endereço) {
        super(nome, valorDaCompra);
        this.endereço = endereço;
    }

    public String getEndereço () {
        return endereço;
    }

    public void setEndereço (String endereço) {
        this.endereço = endereço;
    }

    @Override
    public double CalcularPagamento () {
        double desconto = (this.getValorDaCompra() * 15) / 100;
        return this.getValorDaCompra() - desconto;
    }

    @Override
    public String toString() {
        return "ClienteOuroVip [endereço=" + endereço + "]";
    }
}
