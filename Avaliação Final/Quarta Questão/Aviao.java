public class Aviao extends Brinquedo {

    public Aviao(int velocidade, int aceleracao) {
        super(velocidade, aceleracao);
    }

    @Override
    public void mover() {
        int velocidade = (getAceleracao() * 100) + 50;
        System.out.println(velocidade);
    }
}
