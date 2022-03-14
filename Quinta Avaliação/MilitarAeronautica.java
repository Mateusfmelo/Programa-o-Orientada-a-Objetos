public class MilitarAeronautica extends Militar implements Carreira{
    
    private int antiguidade, horasVoando;

    public MilitarAeronautica(int matricula, String patente, int antiguidade, int horasVoando){
        super(matricula, patente);
        this.antiguidade = antiguidade;
        this.horasVoando = horasVoando;
    }

    @Override
    public boolean podeProgredir(){
        if (this.antiguidade > 2 && this.horasVoando > 100){
            return true;
        }
        return false;
    }
}