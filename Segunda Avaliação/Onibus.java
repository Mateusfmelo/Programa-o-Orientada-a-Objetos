public class Onibus extends Automovel{
    private double valor, comprimento;
    private String descricao, placa;
    private int velocidade, ano, capacidadepassageiro;

    public Onibus(int velocidade, double valor, double comprimento, String descricao, String placa, int ano,
        int capacidadepassageiro) {
        super(velocidade, valor, descricao, placa, ano);
        this.velocidade = velocidade;
        this.valor = valor;
        this.comprimento = comprimento;
        this.descricao = descricao;
        this.placa = placa;
        this.ano = ano;
        this.capacidadepassageiro = capacidadepassageiro;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
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

    public int getCapacidadepassageiro() {
        return capacidadepassageiro;
    }

    public void setCapacidadepassageiro(int capacidadepassageiro) {
        this.capacidadepassageiro = capacidadepassageiro;
    }

    @Override
    public void acelerar() {
        acelerarCaminhaoOuOnibus(this.velocidade);
    }

    @Override
    public void frear() {
        frearCaminhaoOuOnibus(this.velocidade);
    }

    @Override
    public String toString() {
        return "Onibus{" + "velocidade: " + velocidade + ", ano: " + ano + ", descricao: " + descricao;}
    }