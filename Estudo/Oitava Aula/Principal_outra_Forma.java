public class Principal_outra_Forma {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
       
        Animal galinha = new Galinha();
        Gato gato = new Gato();
        Cachorro cachorro  = new Cachorro();        
    
        zoo.adicionar(galinha);
        zoo.adicionar(gato);
        zoo.adicionar(cachorro);
        
        zoo.animarBicharada();
    }
}
