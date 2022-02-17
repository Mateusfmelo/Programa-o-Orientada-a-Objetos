public abstract class Automovel{
    private double velocidade;
    private String descricao, placa;
    private int ano;
    
    public Automovel(double velocidade, String descricao, String placa, int ano) {
        this.velocidade = velocidade;
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
        return "Automovel [ano=" + ano + ", descricao=" + descricao + ", placa=" + placa + ", velocidade=" + velocidade
                + "]";
    }

    
}
