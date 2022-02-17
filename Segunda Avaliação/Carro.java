public class Carro extends Automovel {
    private int potencia, qtdeportas ;

    public Carro(int velocidade, double valor, String descricao, String placa, int ano, int potencia, int qtdeportas) {
        super(velocidade, valor, descricao, placa, ano);
        this.potencia = potencia;
        this.qtdeportas = qtdeportas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getQtdeportas() {
        return qtdeportas;
    }

    public void setQtdeportas(int qtdeportas) {
        this.qtdeportas = qtdeportas;
    }

    @Override
    public void acelerar() {
        acelerarCarroOuMoto(this.velocidade);
    }

    @Override
    public void frear() {
        frearCarroOuMoto(this.velocidade);
    }

    @Override
    public String toString() {
        return "Carro{" + "velocidade: " + velocidade + ", ano: " + ano + ", descricao: " + descricao ;};
    }