public abstract class Cliente {
    private String nome;
    private Double valorDaCompra;

    public Cliente(String nome, Double valorDaCompra) {
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(Double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    public abstract double CalcularPagamento();

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", valorDaCompra=" + valorDaCompra + "]";
    }
}