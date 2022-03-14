import java.util.ArrayList;

public class CadastroMilitar{

    ArrayList <Militar> militares = new ArrayList <> ();
    ArrayList <Carreira> militar = new ArrayList <> ();

    public void adicionarMilitar(Militar m){
        militares.add(m);
        militar.add((Carreira) m);
    }

    public void podeProgredir(){
        for (int c = 0; c < militar.size(); c++){
            if (militar.get(c).podeProgredir()){
                System.out.println("Promoção deferida!");
            } else {
                System.out.println("Promoção indeferida!");
            }
        }
    }

    public void realizarPromocao(){
        for (int c = 0; c < militares.size(); c++){
            if (militares.get(c).getPatente().equals("Sargento") && militar.get(c).podeProgredir()){
                System.out.println("Promovido de Sargento para Subtenente!");
            } else if (militares.get(c).getPatente().equals("Subtenente") && militar.get(c).podeProgredir()){
                System.out.println("Promovido de Subtenente para Tenente!");
            } else if (militares.get(c).getPatente().equals("Tenente")){
                System.out.println("Promovido de Tenente para Capitão!");
            } 
        }
    }
}