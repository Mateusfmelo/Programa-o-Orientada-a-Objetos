public class CadastroBrinquedo {

    private Brinquedo[] brinquedoMovivel;
    private int indice;

    public CadastroBrinquedo(int tamanho){
        brinquedoMovivel = new Brinquedo[tamanho];
        indice = 0;
    }

    public void adicionarBrinquedos(Brinquedo a){
        if(indice < brinquedoMovivel.length){
            brinquedoMovivel[indice] = a;
            indice++;
        }
    }

    public void todoMundoSeMovendo(){
        System.out.println("Todos se movam: ");
        for (int c = 0; c < brinquedoMovivel.length; c++) {
            brinquedoMovivel[c].mover();
        }
    }
}
