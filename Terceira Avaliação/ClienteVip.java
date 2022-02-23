public class ClienteVip extends Cliente {
    private String NumeroDocartão;

    public ClienteVip(String nome, Double valorDaCompra, String NumeroDocartão) {
        super(nome, valorDaCompra);
        this.NumeroDocartão = NumeroDocartão;
    }

    public String getNumeroDocartão () {
        return NumeroDocartão;
    }

    public void setNumeroDocartão(String numeroDocartão) {
        NumeroDocartão = numeroDocartão;
    }

    @Override
    public double CalcularPagamento () {
        double desconto = (this.getValorDaCompra () * 10) / 100;
        return this.getValorDaCompra() - desconto;
    }

    @Override
    public String toString() {
        return "ClienteVip [NumeroDocartão=" + NumeroDocartão + "]";
    }
}