public class Zoologico {
    private Animal animais[] = new Animal[3];
    private int indice = 0;
    
    public void adicionar(Animal a){
        if(indice < animais.length){
             animais[indice] = a;
             indice++;
        }
    }   
    
    public void animarBicharada(){
         for (int i = 0; i < indice; i++){
             animais[i].emitirSom (); //POLIMORFISMO
             animais[i].andar (); //POLIMORFISMO
         }  
    }
 }
 