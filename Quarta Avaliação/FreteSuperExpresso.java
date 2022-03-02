public class FreteSuperExpresso extends Frete {

    private double valorDoSeguro, nivelDeUrgencia;

    public FreteSuperExpresso(double distancia, double valorPorKm, double valorDoSeguro, double nivelDeUrgencia) {
        super(distancia, valorPorKm);
        this.valorDoSeguro = valorDoSeguro;
        this.nivelDeUrgencia = nivelDeUrgencia;
    }

    public double getValorDoSeguro() {
        return valorDoSeguro;
    }

    public void setValorDoSeguro(double valorDoSeguro) {
        this.valorDoSeguro = valorDoSeguro;
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

        var soma = ((distancia*valorPorKm) + (this.nivelDeUrgencia * 100) + this.valorDoSeguro);
        return soma;
    
    }
}