import java.util.ArrayList;
import java.util.List;

public class CadastroFrete {

    private List <Frete> itens = new ArrayList<>();

    public void adicionarFrete (Frete itens) {
        if (this.itens.size() <= 10) {
            this.itens.add(itens);
            if (this.itens.size() == 10) {
                System.out.println("Limite máximo atingido!");
            }
        }   
            else {
                this.itens.remove(10);
    }
}

    public void valorTotalFretes(){
        double total = 0;
        for (int c = 0; c < itens.size(); c++) {
            total += itens.get(c).calcularFrete(itens.get(c).getDistancia(), itens.get(c).getValorPorKm());
        }
        System.out.println("Soma total dos fretes: " + total);
    }
}
