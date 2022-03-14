public class MilitarMarinha extends Militar implements Carreira{
    
    private boolean participouConsertoMar;

    public MilitarMarinha(int matricula, String patente, boolean participouConsertoMar) {
        super(matricula, patente);
        this.participouConsertoMar = participouConsertoMar;
    }

    @Override
    public boolean podeProgredir(){
        if (this.participouConsertoMar == true){
            return true;
        }
        return false;
    }
}