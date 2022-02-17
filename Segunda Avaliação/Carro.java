public class Carro extends Automovel implements Veiculo {
    private double velocidade, valor;
    private String descricao, placa;
    private int ano, qtdeportas, potencia;

    public Carro(double velocidade, double valor, String descricao, String placa, int ano, int qtdeportas,
            int potencia) {
        super(velocidade, descricao, placa, ano);
        this.velocidade = velocidade;
        this.valor = valor;
        this.descricao = descricao;
        this.placa = placa;
        this.ano = ano;
        this.qtdeportas = qtdeportas;
        this.potencia = potencia;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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

    public int getQtdeportas() {
        return qtdeportas;
    }

    public void setQtdeportas(int qtdeportas) {
        this.qtdeportas = qtdeportas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Carro [ano=" + ano + ", descricao=" + descricao + ", placa=" + placa + ", potencia=" + potencia
                + ", qtdeportas=" + qtdeportas + ", valor=" + valor + ", velocidade=" + velocidade + "]";
    }

    @Override
    public void acelerar() {
    }

    @Override
    public void frear() {
    }
}