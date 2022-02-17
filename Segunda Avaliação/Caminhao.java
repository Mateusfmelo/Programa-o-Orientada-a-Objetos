public class Caminhao extends Automovel implements Veiculo {
    private double velocidade, cargasuportada, valor, comprimento;
    private String descricao, placa;
    private int ano;
    
    public Caminhao(double velocidade, double cargasuportada, double valor, double comprimento, String descricao,
            String placa, int ano) {
        super(velocidade, descricao, placa, ano);
        this.velocidade = velocidade;
        this.cargasuportada = cargasuportada;
        this.valor = valor;
        this.comprimento = comprimento;
        this.descricao = descricao;
        this.placa = placa;
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getCargasuportada() {
        return cargasuportada;
    }

    public void setCargasuportada(double cargasuportada) {
        this.cargasuportada = cargasuportada;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Caminhao [ano=" + ano + ", cargasuportada=" + cargasuportada + ", comprimento=" + comprimento
                + ", descricao=" + descricao + ", placa=" + placa + ", valor=" + valor + ", velocidade=" + velocidade
                + "]";
    }

    @Override
    public void acelerar() {
    }

    @Override
    public void frear() {
    }
}
