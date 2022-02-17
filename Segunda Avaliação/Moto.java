public class Moto extends Automovel implements Veiculo{
    private double Velocidade, valor;
    private String descricao, placa;
    private int ano, potencia;
    
    public Moto(double velocidade, double valor, String descricao, String placa, int ano, int potencia) {
        super(velocidade, descricao, placa, ano);
        Velocidade = velocidade;
        this.valor = valor;
        this.descricao = descricao;
        this.placa = placa;
        this.ano = ano;
        this.potencia = potencia;
    }

    public double getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(double velocidade) {
        Velocidade = velocidade;
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

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Moto [Velocidade=" + Velocidade + ", ano=" + ano + ", descricao=" + descricao + ", placa=" + placa
                + ", potencia=" + potencia + ", valor=" + valor + "]";
    }

    @Override
    public void acelerar() {
    }

    @Override
    public void frear() {
    }
}