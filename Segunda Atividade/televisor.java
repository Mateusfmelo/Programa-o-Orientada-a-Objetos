public class Televisor {
    
    private int canal, volume;
    private boolean ligado;
    
    public Televisor(int canal , int volume, boolean ligado){
        this.canal = canal;
        this.volume = volume ;
        this.ligado = ligado;
    }

    public void ligar () {
        if (!ligado) {
            ligado = true;
        }
    }

    public void desligar () {
        if (ligado) {
            ligado = false;
        }
    }
    
    public void aumentarVolume () {
        if (volume > 100){
            volume++;
        }
    }

    public void diminuirVolume () {
        if (volume > 0){
            volume--;
        }
    }

    public void trocarCanal (int novoCanal) {
        if (novoCanal > 0 && novoCanal < 1000){
            this.canal = novoCanal;
        }
    }

    public String toString () {
        return " Canal: " + canal + " Volume: " + volume + " Ligado: " + ligado;
    }
}