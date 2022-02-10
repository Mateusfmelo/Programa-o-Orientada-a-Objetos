public class Principal_com_Vetor {
    public static void main(String[] args) {
        
        Animal animais [] = new Animal [3];
       
        Animal galinha = new Galinha();
        Gato gato = new Gato();
        Cachorro cachorro  = new Cachorro();       
        
        animais [0] = galinha;
        animais [1] = gato;
        animais [2] = cachorro;

        for (Animal a : animais) {
            a.emitirSom (); //POLIMORFISMO
            a.andar ();
        }
    }
}
