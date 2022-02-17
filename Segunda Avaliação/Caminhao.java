public class Caminhao extends Automovel{
    private double cargasuportada, comprimento;
    
    public Caminhao(int velocidade, String descricao, String placa, int ano, double cargasuportada, double valor,
        double comprimento) {
        super(velocidade, valor, descricao, placa, ano);
        this.cargasuportada = cargasuportada;
        this.comprimento = comprimento;
    }

    public double getCargasuportada() {
        return cargasuportada;
    }

    public void setCargasuportada(double cargasuportada) {
        this.cargasuportada = cargasuportada;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
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
        return "Caminhao{" + "velocidade: " + velocidade + ", ano: " + ano + ", valor: " + valor + ", descricao: '" + descricao + '\'' + ", placa: " + placa + '\'' + ", cargaSuportada: " + cargasuportada + ", comprimento: " + comprimento +  '}';
    }

}
