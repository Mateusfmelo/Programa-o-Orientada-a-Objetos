public class Moto extends Automovel{
    private int potencia;
    
    public Moto(int velocidade, double valor, String descricao, String placa, int ano, int potencia) {
        super(velocidade, valor, descricao, placa, ano);
        this.potencia = potencia;
    }

    public int getPotencia(){
        return potencia;
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
        return "Moto{" + "velocidade: " + velocidade + ", ano: " + ano + ", valor: " + valor + ", descricao: '" + descricao + '\'' +", placa: '" + placa + '\'' +", potencia: " + potencia +'}';
    }
}
