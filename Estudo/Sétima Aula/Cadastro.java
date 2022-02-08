public class Cadastro {
    private Pessoa [] pessoas;
    private int indice = 0;

    public Cadastro () {
        pessoas = new Pessoa[10];
    }

    public void adicionar (Pessoa p){
        if (indice < pessoas.length){
            pessoas[indice] = p;
            indice++;
        }
    }
    
    public void quadroSeViraNos30() {
        for (int i = 0; i < indice; i++){
            pessoas[i].seViraNos30();
        }
    }


}
