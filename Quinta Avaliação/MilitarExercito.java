public class MilitarExercito extends Militar implements Carreira{
    
    private boolean participouGuerra, venceuGuerra;

    public MilitarExercito(int matricula, String patente, boolean participouGuerra, boolean venceuGuerra) {
        super(matricula, patente);
        this.participouGuerra = participouGuerra;
        this.venceuGuerra = venceuGuerra;
    }

    @Override
    public boolean podeProgredir(){
        if (this.participouGuerra == true && this.venceuGuerra == true){
            return true;
        }
        return false;
    }
}