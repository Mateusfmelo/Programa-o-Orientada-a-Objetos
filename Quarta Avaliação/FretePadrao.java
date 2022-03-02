public class FretePadrao extends Frete {
    
    public FretePadrao(double distancia, double valorPorKm) {
        super(distancia, valorPorKm);
    }

    @Override
    public double calcularFrete(double distancia, double valorPorKm) {
        distancia = super.getDistancia();
        valorPorKm = super.getValorPorKm();

        var soma = distancia * valorPorKm;
        return soma;
    }
    
}