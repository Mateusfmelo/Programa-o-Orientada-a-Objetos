public class Principal_sem_Vetor {
    public static void main(String[] args) {
       
        Animal galinha = new Galinha();
        Gato gato = new Gato();
        Cachorro cachorro  = new Cachorro();        
    
        galinha.emitirSom();
        galinha.andar();

        gato.emitirSom();
        gato.andar();

        cachorro.emitirSom();
        cachorro.andar();

    }
}