public class FreteExpresso extends Frete {

    private double nivelDeUrgencia;

    public FreteExpresso(double distancia, double valorPorKm, double nivelDeUrgencia) {
        super(distancia, valorPorKm);
    }

    public double getNivelDeUrgencia() {
        return nivelDeUrgencia;
    }

    public void setNivelDeUrgencia(double nivelDeUrgencia) {
        this.nivelDeUrgencia = nivelDeUrgencia;
    }

    @Override
    public double calcularFrete(double distancia, double valorPorKm) {
            distancia = super.getDistancia();
            valorPorKm = super.getValorPorKm();
    
            var soma = ((distancia*valorPorKm)+(this.getNivelDeUrgencia()* 100));
            return soma;
    }
    
}